package ModelTests.QuestionClassGenerateOperatorTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-16.
 */
public class GenerateOperatorInMakeNewQuestionWorks {

    private static Question q;

    @BeforeClass
    public static void setUp() {
        q = new Question();
        q.makeNewQuestion(1);
    }

    @Test
    public void constructorGeneratesAOperator() {
        assertNotSame('\u0000', q.getOperator());       //'\u0000' is the default value of a char according to javadocs.
    }
}
