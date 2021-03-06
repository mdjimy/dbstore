package org.mongojack.internal.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.mongojack.DBQuery;
import org.mongojack.internal.util.helpers.TestEntityOne;

import java.util.ArrayList;
import java.util.List;

public class SerializationUtilsTest {


	@Test
	public void testSerialization() {

		ObjectMapper om = new ObjectMapper();
		JavaType jt = om.constructType(TestEntityOne.class);
		List<String> ss = new ArrayList<>();
		ss.add("argh");
		DBQuery.Query query = DBQuery.in("strings", ss);
		SerializationUtils.serializeQuery(om, jt, query);

	}


}
