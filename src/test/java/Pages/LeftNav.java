package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
}
