public abstract class Function {
    boolean illegalUserTextInput(String text){
        if(text.equals("")){
            return true;
        }

        return false;
    }
}
