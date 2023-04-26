package com.rapsodo.pages;

import com.rapsodo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='https://www.instagram.com/rapsodobaseball']")
    private WebElement baseballInstagram;

    @FindBy(xpath = "//img[@alt='Baseball Youtube']")
    private WebElement baseballYouTube;

    @FindBy(xpath = "//img[@alt='Baseball Twitter']")
    private WebElement baseballTwitter;

    @FindBy(xpath = "//img[@alt='Baseball Facebook']")
    private WebElement baseballFaceBook;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/rapsodosoftball']")
    private WebElement softballInstagram;

    @FindBy(xpath = "//img[@alt='Softball Youtube']")
    private WebElement softballYouTube;

    @FindBy(xpath = "//img[@alt='Softball Twitter']")
    private WebElement softballTwitter;

    @FindBy(xpath = "//img[@alt='Softball Facebook']")
    private WebElement softballFaceBook;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/rapsodogolf/']")
    private WebElement golfInstagram;

    @FindBy(xpath = "//img[@alt='Golf Youtube']")
    private WebElement golfYouTube;

    @FindBy(xpath = "//img[@alt='Golf Twitter']")
    private WebElement golfTwitter;

    @FindBy(xpath = "//img[@alt='Golf Facebook']")
    private WebElement golfFaceBook;

    public WebElement getBaseballInstagram() {
        return baseballInstagram;
    }

    public WebElement getBaseballYouTube() {
        return baseballYouTube;
    }

    public WebElement getBaseballTwitter() {
        return baseballTwitter;
    }

    public WebElement getBaseballFaceBook() {
        return baseballFaceBook;
    }

    public WebElement getSoftballInstagram() {
        return softballInstagram;
    }

    public WebElement getSoftballYouTube() {
        return softballYouTube;
    }

    public WebElement getSoftballTwitter() {
        return softballTwitter;
    }

    public WebElement getSoftballFaceBook() {
        return softballFaceBook;
    }

    public WebElement getGolfInstagram() {
        return golfInstagram;
    }

    public WebElement getGolfYouTube() {
        return golfYouTube;
    }

    public WebElement getGolfTwitter() {
        return golfTwitter;
    }

    public WebElement getGolfFaceBook() {
        return golfFaceBook;
    }
    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
