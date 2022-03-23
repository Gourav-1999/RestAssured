package API;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_PUT {

	@Test
	public void test() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "ustaad");
		map.put("job", "shikaar");
		System.out.println(map);

		JSONObject obj = new JSONObject(map);
		System.out.println(obj);

		given().body(obj.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log()
				.all();
	}
}
