package io.github.cvaldezscse;

import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
import io.github.cvaldezscse.support.Constants;

import java.io.IOException;
import java.util.List;

import java.io.IOException;
import java.net.MalformedURLException;

public class TestDataGenerator {

    public void generateBasicData() {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);

        try {
            HtmlPage page = webClient.getPage(Constants.FAKE_NAME_GENERATOR_URL);

            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            webClient.getOptions().setThrowExceptionOnScriptError(false);
            webClient.getOptions().setPrintContentOnFailingStatusCode(false);
            webClient.getCurrentWindow().getJobManager().removeAllJobs();
            webClient.close();


        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }

}
