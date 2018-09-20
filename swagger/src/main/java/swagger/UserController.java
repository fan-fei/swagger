package swagger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "用户模块")
public class UserController {

    @ApiOperation(value = "输入用户ID并返回用户ID", notes = "暂无备注")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", dataType = "integer", required = false) })
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String name(@PathVariable String id) {
        return id;
    }
}
