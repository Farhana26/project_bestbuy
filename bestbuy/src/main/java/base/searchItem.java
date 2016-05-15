package base;

import item.commonAPI;
import org.testng.annotations.Test;

/**
 * Created by farhana rashid on 5/15/2016.
 */
public class searchItem extends commonAPI {
    @Test
    public void searchNews() throws InterruptedException{
        clickByCss(".search-button");
        Thread.sleep(1000);
        typeByCss("#gh-search-input", "audio");
        takeEnterKeys("#gh-search-input");
        Thread.sleep(3000);
    }
    @Test
    private void singuppage() throws InterruptedException {
        signup(".user.link-text");
        Thread.sleep(3000);
        loginusername("#fld-e", "aboni.heaven@gmail.com");
        loginpassword("#fld-p1","June212010abonee");
        presssignup(".cia-form__submit-button.js-submit-button");
        Thread.sleep(4000);

    }
}
