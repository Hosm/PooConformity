
package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import modele.Result;
import modele.ResultProduit;
import insidefx.undecorator.Undecorator;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javafx.util.Duration;
import modele.TableComformity;

/**
 *
 * @author MHY
 */

public class MainController extends Application implements Initializable {

	Stage primaryStage;
	@FXML
	private LineChart<Integer, Integer> lineChart;
	@FXML
	private PieChart pieChart;
	@FXML
	private TextArea exempleAccountText;
	@FXML
	private TextArea exempleAccountText1;
	@FXML
	private TableView<TableComformity> TableG;
	@FXML
	private TableColumn<TableComformity, Integer> It;
	@FXML
	private TableColumn<TableComformity, Integer> X1t;
	@FXML
	private TableColumn<TableComformity, String> Ot;
	@FXML
	private TableColumn<TableComformity, Integer> Xt;
	@FXML
	private TableColumn<TableComformity, Integer> Yt;
	@FXML
	private TableColumn<TableComformity, Integer> Zt;
	@FXML
	private TableColumn<TableComformity, Integer> Tt;
	@FXML
	private TitledPane exemple1;
	@FXML
	private Button start;

	final NumberAxis xAxis = new NumberAxis();
	final NumberAxis yAxis = new NumberAxis();

	XYChart.Series<Integer, Integer> series1 = new XYChart.Series<Integer, Integer>();

	XYChart.Series<Integer, Integer> series2 = new XYChart.Series<Integer, Integer>();

	XYChart.Series<Integer, Integer> series3 = new XYChart.Series<Integer, Integer>();

	XYChart.Series<Integer, Integer> series4 = new XYChart.Series<Integer, Integer>();

	int compte = 1;
	ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
	final ObservableList<TableComformity> data = FXCollections.observableArrayList();

	@FXML
	private Circle circle0;
	@FXML
	private Label l0, s0;
	@FXML
	private Group link0to0;
	@FXML
	private Circle circle1;
	@FXML
	private Label l1, s1;
	@FXML
	private Group link1to1;
	@FXML
	private Circle circle2;
	@FXML
	private Label l2, s2;
	@FXML
	private Group link2to2;
	@FXML
	private Circle circle3;
	@FXML
	private Label l3, s3;
	@FXML
	private Group link3to3;
	@FXML
	private Circle circle4;
	@FXML
	private Label l4, s4;
	@FXML
	private Group link4to4;
	@FXML
	private Line link0to1;
	@FXML
	private Line link1to2;
	@FXML
	private Line link2to3;
	@FXML
	private Line link3to4;
	PieChart.Data X = new PieChart.Data("X = 0", 25);
	PieChart.Data Y = new PieChart.Data("Y = 0", 25);
	PieChart.Data Z = new PieChart.Data("Z = 0", 25);
	PieChart.Data T = new PieChart.Data("T = 0", 25);

	String[] tableEtat = new String[4];
	ArrayList<ArrayList<String>> tableState = new ArrayList<ArrayList<String>>();

	public void disableAll() {
		circle0.setVisible(false);
		circle1.setVisible(false);
		circle2.setVisible(false);
		circle3.setVisible(false);
		circle4.setVisible(false);
		l0.setVisible(false);
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		s0.setVisible(false);
		s1.setVisible(false);
		s2.setVisible(false);
		s3.setVisible(false);
		s4.setVisible(false);
		link0to0.setVisible(false);
		link1to1.setVisible(false);
		link2to2.setVisible(false);
		link3to3.setVisible(false);
		link4to4.setVisible(false);
		link0to1.setVisible(false);
		link1to2.setVisible(false);
		link2to3.setVisible(false);
		link3to4.setVisible(false);

	}

	public void updateTable(int... x) {
		int c = 0;
		for (int i : x) {
			if (i == 100)
				tableEtat[c] = "N";
			if (i < 100 && i > 0)
				tableEtat[c] = "1";
			c++;
		}
	}

	public void updateState() {
		ArrayList<String> a = new ArrayList<String>();
		a.add(tableEtat[0]);
		a.add(tableEtat[1]);
		a.add(tableEtat[2]);
		a.add(tableEtat[3]);
		if (!tableState.contains(a)) {
			tableState.add(a);
		}
	}

	@SuppressWarnings("unchecked")
	void initCharts() {
		exemple1.setAnimated(true);
		pieChart.setData(pieChartData);
		pieChart.setAnimated(false);
		exempleAccountText.setText("1. class Account1 " + "\n2. 	{" + "\n3.		 protected double bal; "
				+ "\n4. 		 public Account1(double x1){" + "\n5.	 		this.bal=x1;}"
				+ "\n6. 		 public Account1 (Account x1){…}" + "\n7.		  …"
				+ "\n8. 		 public void withdraw (int x1){" + "\n9.			 this.bal=this.bal - x1;}"
				+ "\n10. }");
		exempleAccountText1.setText("1. class Account2 extends Account1" + "\n2. 	{"
				+ "\n3.		 private double InterestRate; " + "\n4. 		 public Account2(double x1,double x2){"
				+ "\n5.	 		super(x1);" + "\n6. 		    this.InterestRate = x2;" + "\n7.		    … }"
				+ "\n8. 		 public void withdraw (int x1){" + "\n9.			 super.withdraw (x1);"
				+ "\n10.        if (x1>bal)" + "\n11.		     this.bal=this.bal – (this.InterestRate)*x1;"
				+ "\n12.		 InterestRate=InterestRate /2;" + "\n13.          }" + "\n14. }");
		lineChart.setTitle("Test Comformity");
		series1.setName("X");
		series4.setName("T");
		series3.setName("Z");
		series2.setName("Y");

		disableAll();
		lineChart.getData().addAll(series1, series2, series3, series4);
		lineChart.setLegendVisible(false);
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			tableEtat[i] = "0";
			a.add("0");
		}
		tableState.add(a);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		It.setCellValueFactory(new PropertyValueFactory<>("i"));
		X1t.setCellValueFactory(new PropertyValueFactory<>("x1"));
		Ot.setCellValueFactory(new PropertyValueFactory<>("o"));
		Xt.setCellValueFactory(new PropertyValueFactory<>("X"));
		Yt.setCellValueFactory(new PropertyValueFactory<>("Y"));
		Zt.setCellValueFactory(new PropertyValueFactory<>("Z"));
		Tt.setCellValueFactory(new PropertyValueFactory<>("T"));
		TableG.setItems(data);
		TableG.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

	}

	public void addData() {

		pieChartData.add(X);
		pieChartData.add(Y);
		pieChartData.add(Z);
		pieChartData.add(T);
		/*
		if(exemple1.isExpanded()){
			Result result = new Result();
			result.conformityTest();
			List<ArrayList<Object>> list = result.getTable();
			final Timeline timeline = new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.millis(200), ae -> boucle(list)));
			timeline.cycleCountProperty();
			timeline.setCycleCount(list.size());
			timeline.play();
		}else {
			ResultProduit resultProd = new ResultProduit();
			resultProd.conformityTest();
			List<ArrayList<Object>> list = resultProd.getTable();
			final Timeline timeline = new Timeline();
			timeline.getKeyFrames().add(new KeyFrame(Duration.millis(200), ae -> boucle(list)));
			timeline.cycleCountProperty();
			timeline.setCycleCount(list.size());
			timeline.play();
		}
	*/
		System.out.println(exemple1.isAnimated());
		
	}

	public void UpdateEtat(int Circlenum, boolean bool, String name, String eX, String eY, String eZ, String eT) {
		switch (Circlenum) {
		case 0:
			l0.setText(name);
			l0.setVisible(bool);
			s0.setText("(" + eX + "," + eY + "," + eZ + "," + eT + ")");
			s0.setVisible(bool);
			circle0.setVisible(bool);
			break;
		case 1:
			l1.setText(name);
			l1.setVisible(bool);
			s1.setText("(" + eX + "," + eY + "," + eZ + "," + eT + ")");
			s1.setVisible(bool);
			circle1.setVisible(bool);
			break;
		case 2:
			l2.setText(name);
			l2.setVisible(bool);
			s2.setText("(" + eX + "," + eY + "," + eZ + "," + eT + ")");
			s2.setVisible(bool);
			circle2.setVisible(bool);
			break;
		case 3:
			l3.setText(name);
			l3.setVisible(bool);
			s3.setText("(" + eX + "," + eY + "," + eZ + "," + eT + ")");
			s3.setVisible(bool);
			circle3.setVisible(bool);
			break;
		case 4:
			l4.setText(name);
			l4.setVisible(bool);
			s4.setText("(" + eX + "," + eY + "," + eZ + "," + eT + ")");
			s4.setVisible(bool);
			circle4.setVisible(bool);
			break;

		default:
			break;
		}
		;
	}

	public void boucle(List<ArrayList<Object>> list) {
		if (compte < list.size()) {
			int Percent[] = new int[5];
			TableComformity table = new TableComformity((int) list.get(compte).get(0), (int) list.get(compte).get(1),
					(String) list.get(compte).get(2), (int) list.get(compte).get(3), (int) list.get(compte).get(4),
					(int) list.get(compte).get(5), (int) list.get(compte).get(6));
			updateTable((int) list.get(compte).get(3), (int) list.get(compte).get(4), (int) list.get(compte).get(5),
					(int) list.get(compte).get(6));
			updateState();
			for (int i = 0; i < tableState.size(); i++) {
				UpdateEtat(i, true, "0", tableState.get(i).get(0), tableState.get(i).get(1), tableState.get(i).get(2),
						tableState.get(i).get(3));
			}
			data.add(table);
			TableG.scrollTo(compte);
			graphe(series1, (int) list.get(compte).get(0), (int) list.get(compte).get(3));
			graphe(series2, (int) list.get(compte).get(0), (int) list.get(compte).get(4));
			graphe(series3, (int) list.get(compte).get(0), (int) list.get(compte).get(5));
			graphe(series4, (int) list.get(compte).get(0), (int) list.get(compte).get(6));
			Percent[0] = (int) list.get(compte).get(0);
			Percent[1] = (int) list.get(compte).get(3);
			Percent[2] = (int) list.get(compte).get(4);
			Percent[3] = (int) list.get(compte).get(5);
			Percent[4] = (int) list.get(compte).get(6);

			X = new PieChart.Data("X = " + (100 * Percent[1] / Percent[0]) + "%", 100 * Percent[1] / Percent[0]);
			pieChartData.set(0, X);
			Y = new PieChart.Data("Y = " + (100 * Percent[2] / Percent[0]) + "%", 100 * Percent[2] / Percent[0]);
			pieChartData.set(1, Y);
			Z = new PieChart.Data("Z = " + (100 * Percent[3] / Percent[0]) + "%", 100 * Percent[3] / Percent[0]);
			pieChartData.set(2, Z);
			T = new PieChart.Data("T = " + (100 * Percent[4] / Percent[0]) + "%", 100 * Percent[4] / Percent[0]);
			pieChartData.set(3, T);

			compte++;
		}
	}

	@Override
	public void start(final Stage stage) throws Exception {
		primaryStage = stage;
		primaryStage.setTitle("Dissimilitude et Conformité Test");
		// The UI (Client Area) to display
		Region root = null;
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Interface.fxml"));
			fxmlLoader.setController(this);
			root = (Region) fxmlLoader.load();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		final Undecorator undecorator = new Undecorator(stage, root);
		undecorator.getStylesheets().add("skin/undecorator.css");
		Node node = root.lookup("#draggableNode");
		undecorator.setAsStageDraggable(stage, node);
		Scene scene = new Scene(undecorator);
		undecorator.installAccelerators(scene);
		undecorator.setFadeInTransition();
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent we) {
				we.consume(); // pas effacer
				undecorator.setFadeOutTransition();
			}
		});

		scene.setFill(Color.TRANSPARENT);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setScene(scene);
		initCharts();
		stage.show();
		stage.setMinWidth(undecorator.getMinWidth());
		stage.setMinHeight(undecorator.getMinHeight());

	}

	/**
	 * Handles Utility stage buttons
	 *
	 * @param event
	 */
	public void handleUtilityAction(ActionEvent event) {
		((Node) event.getSource()).getScene().getWindow().hide();
	}

	/**
	 * Demo purpose only, Fill charts with data
	 */

	public void graphe(XYChart.Series<Integer, Integer> series, int i, int graphe) {
		series.getData().add(new Data<Integer, Integer>(i, graphe));
	}

	public static void main(String[] args) {
		launch(args);
	}

}
