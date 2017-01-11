package user_common_code;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * @Author: [liguiqin]
 * @Date: [2016-11-23 15:47]
 * @Description: [测试配置项]
 * @Version: [1.0.0]
 * @Copy: [org.ndshop]
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.bjike.goddess.user.jpa.dao"})
@EnableTransactionManagement(proxyTargetClass = true)
@EnableCaching
@PropertySource("classpath:config.properties")
@ImportResource({"classpath:application.xml"})
@ComponentScan(basePackages = {"user_common_code","com.bjike.goddess.user.common"},
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = {Configuration.class})})
public class ApplicationConfiguration{

}
