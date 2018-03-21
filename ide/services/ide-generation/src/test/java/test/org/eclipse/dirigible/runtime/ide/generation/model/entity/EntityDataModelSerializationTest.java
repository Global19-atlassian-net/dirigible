package test.org.eclipse.dirigible.runtime.ide.generation.model.entity;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.eclipse.dirigible.commons.api.helpers.GsonHelper;
import org.eclipse.dirigible.runtime.ide.generation.model.entity.EntityDataModel;
import org.eclipse.dirigible.runtime.ide.generation.model.entity.EntityDataModelEntity;
import org.eclipse.dirigible.runtime.ide.generation.model.entity.EntityDataModelProperty;
import org.eclipse.dirigible.runtime.ide.generation.model.entity.EntityDataModelRoot;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonSyntaxException;

public class EntityDataModelSerializationTest {
	
	private static final Logger logger = LoggerFactory.getLogger(EntityDataModelSerializationTest.class);
	
	@Test
	public void serialize() {
		EntityDataModel model = new EntityDataModel();
		EntityDataModelRoot root = new EntityDataModelRoot();
		List<EntityDataModelEntity> entities = new ArrayList<EntityDataModelEntity>();
		EntityDataModelEntity entity1 = new EntityDataModelEntity();
		entity1.setName("Entity1");
		entity1.setDataName("ENTITY1");
		entity1.setLayoutType("MANAGE");
		entity1.setMenuKey("entity1");
		entity1.setMenuLabel("Entity1");
		entity1.setPrimary(true);
		List<EntityDataModelProperty> properties = new ArrayList<EntityDataModelProperty>();
		EntityDataModelProperty property1 = new EntityDataModelProperty();
		property1.setName("property1");
		property1.setDataName("PROPERTY1");
		property1.setDataAutoIncrement(true);
		property1.setDataDefaultValue("");
		property1.setDataLength("20");
		property1.setDataNotNull(true);
		property1.setDataPrecision("");
		property1.setDataScale("");
		property1.setDataType("VARCHAR");
		property1.setDataUnique(true);
		property1.setRelationshipCardinality("1_n");
		property1.setRelationshipType("COMPOSITION");
		property1.setRelationshipName("link");
		property1.setWidgetType("TEXTBOX");
		property1.setWidgetPattern("");
		property1.setWidgetService("");
		property1.setWidgetLength("20");
		entity1.setProperties(properties);
		properties.add(property1);
		entities.add(entity1);
		root.setEntities(entities);
		model.setModel(root);
		String json = GsonHelper.GSON.toJson(model);
		logger.info(json);
	}
	
	@Test
	public void parse() throws JsonSyntaxException, IOException {
		InputStream in = EntityDataModelSerializationTest.class.getResourceAsStream("/test.model");
		EntityDataModel model = GsonHelper.GSON.fromJson(IOUtils.toString(in), EntityDataModel.class);
		assertEquals(2, model.getModel().getEntities().size());
	}

}
