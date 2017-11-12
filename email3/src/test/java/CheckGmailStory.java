import Steps.CheckGmailStep;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.List;

/**
 * Created by equipo on 11/11/2017.
 */
public class CheckGmailStory extends JUnitStory {
    public Configuration configuration(){
        return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(this.getClass())).useStoryReporterBuilder(
                new StoryReporterBuilder().withDefaultFormats().withFormats(Format.HTML,Format.TXT));
    }

    public List<CandidateSteps> candidateSteps(){
        return new InstanceStepsFactory(configuration(), new CheckGmailStep()).createCandidateSteps();
    }
}
