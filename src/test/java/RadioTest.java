import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void showCurrentStation() {   // 1. показ текущей радиостанции
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextStation() {      // 2. переключение радиостанции вверх

        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.setNextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchPrevStation() {       // 3. переключение радиостанции вниз
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.setPrevStation();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchNextStationMax() {      //  4. переключение радиостанции больше максимального
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchPrevStationMin() {      //  5. переключение радиостанции меньше минимального
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.setPrevStation();


        int expected = 9;
        int actual = radio.getCurrentStation();
    }

    @Test
    public void showCurrentVolume() {    // 6. показ текущей громкости
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchNextVolume() {     // 7. переключение громкости вверх
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setNextVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchPrevVolume() {     // 8. переключение громкости вниз
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setPrevVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchPrevVolumeMin() {   // 9. переключение громкости ниже нуля
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.setPrevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void switchNextVolumeMax() {    // 10. переключение громкости выше ста
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.setNextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void setCurrentStationNegative() {   // 11. проверка текущей радиостанции, что она не может быть установлена меньше нуля
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveLimit() {   // 12. проверка текущей радиостанции, что она не может быть установлена выше девяти
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}


