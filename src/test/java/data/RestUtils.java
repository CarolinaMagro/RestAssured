package data;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils
{
    public static String getPetName()
    {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Blacky" + generatedString);
    }

    public static String getPetCategory()
    {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Labrador" + generatedString);
    }

    public static String getPetTags()
    {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Domestico" + generatedString);
    }
}
