package scootertests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DropdownTextTest extends TestBase {

    @Parameterized.Parameters(name = "{0}")
    public static Object[][] data() {
        return new Object[][]{
                {"Сколько это стоит? И как оплатить?",
                        "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",0},
                {"Хочу сразу несколько самокатов! Так можно?",
                        "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",1},
                {"Как рассчитывается время аренды?",
                        "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",2},
                {"Можно ли заказать самокат прямо на сегодня?",
                        "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",3},
                {"Можно ли продлить заказ или вернуть самокат раньше?",
                        "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",4},
                {"Вы привозите зарядку вместе с самокатом?",
                        "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",5},
                {"Можно ли отменить заказ?",
                        "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",6},
                {"Я жизу за МКАДом, привезёте?",
                        "Да, обязательно. Всем самокатов! И Москве, и Московской области.",7},
        };
    }
    @Parameterized.Parameter
    public String answer; //вопрос из параметризированного массива
    @Parameterized.Parameter(1)
    public String question; //ответ из параметризированного массива
    @Parameterized.Parameter(2)
    public int index; //индекс элемента для инициализации локатора


    @Test
    public void checkAccordion() {
        //клик по вопросу
        objHomePage.clickPanel(index);
        //проверка, что ответ на вопрос видим на экране
        Assert.assertTrue(objHomePage.isPanelVisible(index));
        //проверка текста вопроса
        assertEquals(answer, objHomePage.getTextFromAnswer(index));
        //проверка текста ответа
        assertEquals(question, objHomePage.getTextFromQuestion(index));
    }
}
