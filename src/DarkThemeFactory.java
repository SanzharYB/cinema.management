public class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new Button.DarkThemeButton();
    }
}
