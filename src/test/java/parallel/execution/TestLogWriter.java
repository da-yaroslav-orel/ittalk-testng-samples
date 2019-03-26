package parallel.execution;

import org.pmw.tinylog.Configuration;
import org.pmw.tinylog.LogEntry;
import org.pmw.tinylog.writers.LogEntryValue;
import org.pmw.tinylog.writers.Writer;
import org.testng.Reporter;

import java.util.EnumSet;
import java.util.Set;

import static org.pmw.tinylog.writers.LogEntryValue.RENDERED_LOG_ENTRY;

public class TestLogWriter implements Writer {
    @Override
    public Set<LogEntryValue> getRequiredLogEntryValues() {
        return EnumSet.of(RENDERED_LOG_ENTRY);
    }

    @Override
    public void init(Configuration configuration) throws Exception { }

    @Override
    public void write(LogEntry logEntry) throws Exception {
        Reporter.log(logEntry.getMessage());
    }

    @Override
    public void flush() throws Exception { }

    @Override
    public void close() throws Exception { }
}
