package au.org.ala.webapi

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(AppController)
@Mock(App)
class AppControllerSpec extends Specification {

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.appList
        model.appCount == 0
    }
}
