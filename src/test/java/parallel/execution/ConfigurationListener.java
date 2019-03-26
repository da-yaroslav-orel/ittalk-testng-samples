package parallel.execution;

import org.pmw.tinylog.Configurator;
import org.testng.IExecutionListener;

public class ConfigurationListener implements IExecutionListener {

    String PATTERN = "{HH:mm:ss} {level}: {message}";

    @Override
    public void onExecutionStart() {
        Configurator.defaultConfig()
                .writer(new TestLogWriter())
                .formatPattern(PATTERN)
                .activate();
    }

    @Override
    public void onExecutionFinish() { }
}
