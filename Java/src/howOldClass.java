public class howOldClass {
    public static int howOld(final String herOld) {
        return herOld.charAt(0) - 48; //- '0';
        //return Character.getNumericValue(herOld.charAt(0));
    }
}
