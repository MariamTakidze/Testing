package myTests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import posts.DeletePostMethod;
import posts.GetPostMethod;
import posts.PostPostMethod;

public class PostsAPI implements IAbstractTest {
    @Test()
    @MethodOwner(owner = "Gango")
    public void testGetUser() {
        GetPostMethod getPostMethod = new GetPostMethod();

        getPostMethod.callAPI();
        getPostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getPostMethod.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "Gango")
    public void testPostUser(){
        PostPostMethod postPostMethod = new PostPostMethod();

        postPostMethod.callAPI();
        postPostMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postPostMethod.validateResponse();
    }
    @Test()
    @MethodOwner(owner = "Gango")
    public void testDeleteUser(){
        DeletePostMethod deletePostMethod = new DeletePostMethod();

        deletePostMethod.callAPI();
        deletePostMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        deletePostMethod.validateResponse();
    }
}
