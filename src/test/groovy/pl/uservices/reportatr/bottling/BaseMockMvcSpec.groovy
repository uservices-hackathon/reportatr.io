package pl.uservices.reportatr.bottling
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import spock.lang.Specification

abstract class BaseMockMvcSpec extends Specification {

    def setup() {
        setupMocks()
        RestAssuredMockMvc.standaloneSetup()
    }

    void setupMocks() {
    }

}
