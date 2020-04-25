package fifthTask.WordsParser;

public class Loader {
    public static void main(String[] args) {
        String longText = "Marketing company Kickass Masterminds posted an Instagram slide - since " +
                "removed - of applicant Emily Clow, along with advice on professionalism. " +
                "Do not share your social media with a potential employer if this is the kind of content on it,\" it said. " +
                "The company has since made its own accounts private after receiving \"death threats and harassing messages\". " +
                "Ms Clow applied for a marketing role with the firm as \"it was a company founded by women, seemed to " +
                "support women in business and worked with start-ups\". But she was shocked by the public shaming. " +
                "The company's post went on: \"I am looking for a professional marketer - not a bikini model. " +
                "\"Go on with your bad self and do whatever in private. But this is not doing you any favors in finding " +
                "a professional job.\"" + "Ms Clow said the application form requested an Instagram and/or Facebook handle." +
                "The company then suggested she should follow its Instagram account, and it was at that point she made " +
                "the discovery. \"I went through their company story [on Instagram] and saw they had posted my picture." +
                "\"I honestly was taken aback. I wasn't sure how to react and it took me a while to process what had " +
                "happened.\"";
        System.out.println(longText);
        String[] longTextAfterReplace = longText.replaceAll("[^a-z^A-Z^0-9]", " ").split("\\s+");
        printText(longTextAfterReplace);

        //Попробуем с русским текстом для интереса
        String russianText = "Он, однако ж, не то чтоб уж был совсем в беспамятстве во всё время болезни: это было лихорадочное состояние, с бредом и полусознанием. Многое он потом припомнил. То казалось ему, что около него собирается много народу и хотят его взять и куда-то вынести, очень об нем спорят и ссорятся. То вдруг он один в комнате, все ушли и боятся его, и только изредка чуть-чуть отворяют дверь посмотреть на него, грозят ему, сговариваются об чем-то промеж себя, смеются и дразнят его. Настасью он часто помнил подле себя; различал и еще одного человека, очень будто бы ему знакомого, но кого именно — никак не мог догадаться и тосковал об этом, даже и плакал. Иной раз казалось ему, что он уже с месяц лежит; в другой раз — что всё тот же день идет. Но об том — об том он совершенно забыл; зато ежеминутно помнил, что об чем-то забыл, чего нельзя забывать, — терзался, мучился, припоминая, стонал, впадал в бешенство или в ужасный, невыносимый страх. Тогда он порывался с места, хотел бежать, но всегда кто-нибудь его останавливал силой, и он опять впадал в бессилие и беспамятство. Наконец он совсем пришел в себя.\n" +
                "(Ф. М. Достоевский \"Преступление и наказание\")";
        System.out.println("\n\n\nРусский Текст:\n" + russianText);
        String[] russianTextAfterReplace = russianText.replaceAll("[^А-я]", " ").split("\\s+");
        printText(russianTextAfterReplace);

    }
    private static void printText (String[] text)
    {
        for (int i = 0; i < text.length; i++)
        {
            System.out.print(text[i] + " ");
        }
    }
}
