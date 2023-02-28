package posts;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;
@Endpoint(url = "${base_url}/posts", methodType = HttpMethodType.POST)
@RequestTemplatePath(path ="api/posts/_post/rq.json")
@ResponseTemplatePath(path ="api/posts/_post/rs.json")
public class PostPostMethod extends AbstractApiMethodV2 {

    public PostPostMethod (){
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
