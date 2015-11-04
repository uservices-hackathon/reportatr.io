package pl.uservices.reportatr.base

import com.ofg.infrastructure.base.IntegrationSpec
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import pl.uservices.reportatr.Application

@ContextConfiguration(classes = [Application], loader = SpringApplicationContextLoader)
class MicroserviceIntegrationSpec extends IntegrationSpec {
}
