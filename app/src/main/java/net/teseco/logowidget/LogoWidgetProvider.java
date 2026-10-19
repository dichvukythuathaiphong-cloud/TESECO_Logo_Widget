package net.teseco.logowidget;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;
public class LogoWidgetProvider extends AppWidgetProvider {
 @Override public void onUpdate(Context context, AppWidgetManager manager, int[] ids) {
  for (int id : ids) manager.updateAppWidget(id, new RemoteViews(context.getPackageName(), R.layout.logo_widget));
 }
}
