/**
 * Created by equipo on 6/11/2017.
 */


import java.util.List;

import Steps.SendEmailStep;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;


public class SendEmailStory extends JUnitStory{


    public Configuration configuration(){
        return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(this.getClass())).useStoryReporterBuilder(
                new StoryReporterBuilder().withDefaultFormats().withFormats(Format.HTML,Format.TXT));
    }

    public List<CandidateSteps> candidateSteps(){
         return new InstanceStepsFactory(configuration(), new SendEmailStep()).createCandidateSteps();
    }
}
