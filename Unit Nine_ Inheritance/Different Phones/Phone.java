public class Phone
{
    private boolean isSmart;
    
    public Phone(){
        isSmart = false;
    }
    
    public Phone(boolean isSmart){
        this.isSmart = isSmart;
    }
    
    public boolean smart(){
        return isSmart;
    }
}