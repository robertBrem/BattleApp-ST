package ninja.disruptor.battleapp;

import com.airhacks.rulz.jaxrsclient.JAXRSClientProvider;
import org.junit.Rule;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static com.airhacks.rulz.jaxrsclient.JAXRSClientProvider.buildWithURI;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BattleAppIT {

    @Rule
    public JAXRSClientProvider provider = buildWithURI("http://disruptor.ninja:31080/battleapp/resources/users");

    @Test
    public void shouldReturn200() {
        Response response = provider
                .target()
                .request()
                .get();
        assertThat(response.getStatus(), is(200));
    }

}
