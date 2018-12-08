package schmille.assassinswheat.utility;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import schmille.assassinswheat.reference.Reference;

public class ModLogger {
    private static org.apache.logging.log4j.Logger log;
    public static final Level all = Level.ALL;
    public static final Level info = Level.INFO;
    public static final Level debug = Level.DEBUG;
    public static final Level error = Level.ERROR;
    public static final Level fatal = Level.FATAL;
    public static final Level off = Level.OFF;
    public static final Level trace = Level.TRACE;
    public static final Level warn = Level.WARN;

    public static void log(Level pLevel, Object pMessage)
    {
        log.log(pLevel,Reference.MOD_NAME+" - "+String.valueOf(pMessage));
    }

    public static void debug(Object pMessage)
    {
        log(debug,pMessage);
    }

    public static void all(Object pMessage)
    {
        log(all,pMessage);
    }

    public static void info(Object pMessage)
    {
        log(info,pMessage);
    }

    public static void error(Object pMessage)
    {
        log(error,pMessage);
    }

    public static void fatal(Object pMessage)
    {
        log(fatal,pMessage);
    }

    public static void off(Object pMessage)
    {
        log(off,pMessage);
    }

    public static void trace(Object pMessage)
    {
        log(trace,pMessage);
    }

    public static void warn(Object pMessage)
    {
        log(warn,pMessage);
    }

    public static void setLogger(Logger pLogger)
    {
        log = pLogger;
    }



}
