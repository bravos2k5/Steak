package steamfake.view.admin.statistic;

import org.jfree.chart.*;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.data.category.DefaultCategoryDataset;
import steamfake.dao.StatisticDAO;
import steamfake.utils.XChart;

import javax.swing.*;
import java.awt.*;
import java.util.TreeMap;

public class RevenueChart extends JPanel {

    public RevenueChart() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        ChartPanel chartPanel = createChartPanel(createAllYearChart());
        chartPanel.addChartMouseListener(new ChartMouseListener() {
            @Override
            public void chartMouseClicked(ChartMouseEvent e) {
                showYearDetailRevenue(e);
            }

            @Override
            public void chartMouseMoved(ChartMouseEvent e) {

            }
        });
        this.add(chartPanel);
    }

    private DefaultCategoryDataset createAllYearDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        TreeMap<Integer,Integer> revenueMap = StatisticDAO.selectTotalRevenueEachYear();
        for (Integer year : revenueMap.keySet()) {
            dataset.addValue(revenueMap.get(year), "Tổng Doanh Thu", year);
        }
        return dataset;
    }

    private DefaultCategoryDataset createYearDataset(int year) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        TreeMap<Integer,Integer> revenueMap = StatisticDAO.selectTotalRevenueEachMonth(year);
        for (Integer month : revenueMap.keySet()) {
            dataset.addValue(revenueMap.get(month), "Tổng Doanh Thu", month);
        }
        return dataset;
    }

    private JFreeChart createAllYearChart() {
        JFreeChart chart = ChartFactory.createBarChart(
                "Tổng Doanh Thu Theo Từng Năm Của Công Ty",
                "Năm",
                "Tổng Doanh Thu",
                createAllYearDataset(),
                org.jfree.chart.plot.PlotOrientation.VERTICAL,
                false,
                true,
                false
        );
        XChart.formatChart(chart);
        return chart;
    }

    private JFreeChart createYearChart(int year) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Doanh Thu Của Công Ty Năm " + year,
                "Tháng",
                "Tổng Doanh Thu",
                createYearDataset(year),
                org.jfree.chart.plot.PlotOrientation.VERTICAL,
                false,
                true,
                false
        );
        XChart.formatChart(chart);
        return chart;
    }

    private ChartPanel createChartPanel(JFreeChart chart) {
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        chartPanel.setDomainZoomable(false);
        chartPanel.setRangeZoomable(false);
        return chartPanel;
    }

    private void showYearDetailRevenue(ChartMouseEvent e) {
        ChartEntity entity = e.getEntity();
        if (entity instanceof org.jfree.chart.entity.CategoryItemEntity item) {
            int year = (int) item.getColumnKey();
            showYearDetailRevenueDialog(year);
        }
    }

    private void showYearDetailRevenueDialog(int year) {
        JDialog dialog = new JDialog((Frame) null);
        dialog.setTitle("Doanh Thu Của Công Ty Năm " + year);
        dialog.setSize(1200, 800);
        dialog.add(createChartPanel(createYearChart(year)));
        dialog.setModal(true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }

}
