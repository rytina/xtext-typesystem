package de.itemis.xtext.typesystem.dsl.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import de.itemis.xtext.typesystem.dsl.generator.Utils;
import de.itemis.xtext.typesystem.dsl.tsDsl.AbstractTypeTypingRule;
import de.itemis.xtext.typesystem.dsl.tsDsl.CharRef;
import de.itemis.xtext.typesystem.dsl.tsDsl.ComatibilityTypeConstraint;
import de.itemis.xtext.typesystem.dsl.tsDsl.CommonSuperTypeOfRule;
import de.itemis.xtext.typesystem.dsl.tsDsl.EClassRef;
import de.itemis.xtext.typesystem.dsl.tsDsl.FeatureTypeConstraint;
import de.itemis.xtext.typesystem.dsl.tsDsl.FixedTypingRule;
import de.itemis.xtext.typesystem.dsl.tsDsl.MetaclassSpec;
import de.itemis.xtext.typesystem.dsl.tsDsl.Section;
import de.itemis.xtext.typesystem.dsl.tsDsl.TsDslPackage;
import de.itemis.xtext.typesystem.dsl.tsDsl.TypeComparisonFeature;
import de.itemis.xtext.typesystem.dsl.tsDsl.TypeOfFeatureRule;
import de.itemis.xtext.typesystem.dsl.tsDsl.TypeRecursionFeatures;
import de.itemis.xtext.typesystem.dsl.tsDsl.TypeSpec;
import de.itemis.xtext.typesystem.dsl.tsDsl.TypesystemSpec;
 

public class TsDslJavaValidator extends AbstractTsDslJavaValidator {

	@Check
	public void checkUniqueTypeRule(MetaclassSpec s) {
		for (MetaclassSpec ms: all(s)) {
			if ( ms != s && ms.getClazz() == s.getClazz()) {
				error("duplicate type spec", TsDslPackage.eINSTANCE.getMetaclassSpec_Clazz());
			}
		}
	}
	

	@Check
	public void checkTypeOfFeature( AbstractTypeTypingRule r ) {
		MetaclassSpec spec = (MetaclassSpec) r.eContainer();
		TypesystemSpec tsspec = (TypesystemSpec)spec.eContainer().eContainer();
		Iterable<EClass> subtypes = new Utils().subtypes(spec.getClazz());
		for (EClassifier sub : subtypes) {
			if (! new Utils().hasSpecFor(tsspec, (EClass)sub)) {
				error("subtype "+sub.getName()+" not handled", spec, TsDslPackage.eINSTANCE.getMetaclassSpec_TypingRule(), -1);
			}
		}
	}

	
	@Check
	public void checkTypeOfFeature( TypeOfFeatureRule r ) {
		MetaclassSpec spec = (MetaclassSpec) r.eContainer();
		EClass target = (EClass)r.getFeature().getEType();
		checkTypePropagation(spec, target, TsDslPackage.eINSTANCE.getTypeOfFeatureRule_Feature());
	}

	@Check
	public void checkTypeOfFeature( FixedTypingRule r ) {
		MetaclassSpec spec = (MetaclassSpec) r.eContainer();
		checkTypePropagation(spec, r.getClazz(), TsDslPackage.eINSTANCE.getFixedTypingRule_Clazz());
	}

	@Check
	public void checkTypeOfFeature( TypeRecursionFeatures f ) {
		MetaclassSpec spec = (MetaclassSpec) f.eContainer();
		checkTypePropagation(spec, (EClass)f.getFeature().getEType(), TsDslPackage.eINSTANCE.getTypeRecursionFeatures_Feature());
	}


	@Check
	public void checkTypeOfFeature( CommonSuperTypeOfRule r ) {
		MetaclassSpec spec = (MetaclassSpec) r.eContainer();
		checkTypePropagation(spec, (EClass)r.getFeature1().getEType(), TsDslPackage.eINSTANCE.getCommonSuperTypeOfRule_Feature1());
		checkTypePropagation(spec, (EClass)r.getFeature2().getEType(), TsDslPackage.eINSTANCE.getCommonSuperTypeOfRule_Feature2());
	}


	
	
	@Check
	public void checkTypeOfFeature( FeatureTypeConstraint c ) {
		MetaclassSpec spec = (MetaclassSpec) c.eContainer();
		EClass target = (EClass)c.getFeature().getEType();
		checkTypePropagation(spec, target, TsDslPackage.eINSTANCE.getFeatureTypeConstraint_Feature());
		for (TypeSpec cls: c.getTypes()) {
			if ( cls instanceof EClassRef ) {
				checkTypePropagation(spec, ((EClassRef)cls).getClazz(), TsDslPackage.eINSTANCE.getFeatureTypeConstraint_Types());
			}
			if ( cls instanceof CharRef) {
				throw new RuntimeException("Not yet implemneted");
			}
		}
	}

	@Check
	public void checkTypeOfFeature( ComatibilityTypeConstraint c ) {
		MetaclassSpec spec = (MetaclassSpec) c.eContainer();
		EClass target1 = (EClass)c.getFeature1().getEType();
		checkTypePropagation(spec, target1, TsDslPackage.eINSTANCE.getComatibilityTypeConstraint_Feature1());
		EClass target2 = (EClass)c.getFeature1().getEType();
		checkTypePropagation(spec, target2, TsDslPackage.eINSTANCE.getComatibilityTypeConstraint_Feature2());
	}

	
	
	
	private void checkTypePropagation( MetaclassSpec spec, EClass target, EStructuralFeature errorFeature ) {
		TypesystemSpec tsspec = (TypesystemSpec)spec.eContainer().eContainer();
		if ( ! new Utils().hasSpecFor(tsspec, target)) {
			error("no typing rule available for "+target.getName(), errorFeature);
		}
	}
	
	
	private List<MetaclassSpec> all(MetaclassSpec mcs) {
		List<MetaclassSpec> res = new ArrayList<MetaclassSpec>();
		TypesystemSpec tss = (TypesystemSpec) mcs.eContainer().eContainer();
		for (Section section: tss.getSections()) {
			for (MetaclassSpec ms: section.getMetaclassSpecs()) {
				res.add(ms);
			}
		}
		return res;
	}
	
	
	
	
	

}
