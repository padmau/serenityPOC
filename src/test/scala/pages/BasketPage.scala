package pages

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions

/**
  * Created by user01 on 30/04/18.
  */
trait BasketPage extends BasePage {

  val basketHover = By.cssSelector("img.huc-no-radius")
  val hiddenBasket = By.cssSelector(".sc-product-title")
  val oneItem = By.cssSelector("#hlb-subcart > div:nth-child(1) > span:nth-child(1) > span:nth-child(1) > b:nth-child(1)")


  def hoverOverBasket = {
    findElement(basketHover)
    explicitWait.until(ExpectedConditions.visibilityOfElementLocated(hiddenBasket))
    action.moveToElement(findElement(hiddenBasket)).build().perform()
  }
  def assertOneItem = findElement(oneItem)

}