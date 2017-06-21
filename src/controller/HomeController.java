package controller;

import gui.CarChoicePanel;
import gui.HomePanel;
import gui.LoginPanel;
import gui.MainFrame;
import gui.UpgradePanel;
import model.Car;

public class HomeController implements Controller {

	private static HomeController instance;

	public HomeController() {
		super();
	}

	public static HomeController getInstance() {

		if (instance == null) {

			instance = new HomeController();

		}

		return instance;

	}

	@Override
	public void initController() {
		HomePanel.getInstance().getBtnBack().addActionListener(e -> backToLoginPanel());
		HomePanel.getInstance().getBtnGoToNextScreen().addActionListener(e -> goToCarChoicePanel());
		HomePanel.getInstance().getBtnGoToUpgradeCenter().addActionListener(e -> goToUpgradePanel());
	}

	private void backToLoginPanel() {
		MainFrame.getInstance().replacePanel(LoginPanel.getInstance());
	}

	private void goToCarChoicePanel() {
		MainFrame.getInstance().replacePanel(CarChoicePanel.getInstance());
	}

	private void goToUpgradePanel() {
		MainFrame.getInstance().replacePanel(UpgradePanel.getInstance());
	}
}
