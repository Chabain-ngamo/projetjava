package view.menuElement;

import contract.Menu;

public class MainMenu extends MenuElement {
	public MainMenu(String content, int size, int alpha) {
		super(content, size, alpha);
	}
	
	@Override
	public Menu MenuRequest() {
		if(this.isSelected()) {
			return Menu.Mainmenu;
		}
		return Menu.Nop;
	}

}