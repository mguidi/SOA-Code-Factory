package com.mguidi.soa.validation

import org.eclipse.xtext.validation.Check
import com.mguidi.soa.soa.Model
import com.mguidi.soa.soa.SoaPackage
import com.mguidi.soa.soa.Entities
import java.util.HashSet
import com.mguidi.soa.soa.Feature
import com.mguidi.soa.soa.Entity

class SOAValidator extends AbstractSOAValidator {

	@Check
	def void checkEntityNameIsUnique(Entities entity) {
		var model = (entity.eContainer as Model);

		for (Entities e : model.entities.filter(typeof(Entities))) {
			if (e != entity && e.name.equals(entity.name)) {
				error("Entity and Enum names have to be unique", SoaPackage.Literals.ENTITIES__NAME);
				return;
			}
		}
	}

	@Check
	def void checkEntityFeatureNameIsUnique(Entity entity) {
		var set = new HashSet<String>
		for (Feature e : entity.features) {
			if (set.contains(e.name)) {
				error("feature name have to be unique", SoaPackage.Literals.FEATURE__NAME);
				return;

			} else {
				set.add(e.name)
			}
		}
	}

}
