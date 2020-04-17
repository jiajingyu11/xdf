package ${basePackage}.service;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.core.Service;
import com.company.project.model.${modelNameUpperCamel}Example;
import java.util.List;


/**
 * Created by ${author} on ${date}.
 */
public interface ${modelNameUpperCamel}Service extends Service<${modelNameUpperCamel}> {

    List<${modelNameUpperCamel}> findByExample(${modelNameUpperCamel}Example ${modelNameLowerCamel}Example );

}
