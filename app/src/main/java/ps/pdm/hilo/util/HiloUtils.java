package ps.pdm.hilo.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by inalberth on 14/04/15.
 */
public class HiloUtils {

    public static boolean validarCampos(ViewGroup viewGroup) {

        for (int i = 0; i < viewGroup.getChildCount(); i++) {

            View view = viewGroup.getChildAt(i);

            if (view instanceof EditText && TextUtils.isEmpty(((EditText) view).getText().toString()))
                return false;

            if (view instanceof Spinner && TextUtils.isEmpty(((Spinner) view).getSelectedItem().toString()))
                return false;
        }

        return true;
    }

    public static void limparCampos(ViewGroup viewGroup) {

        for (int i = 0; i < viewGroup.getChildCount(); i++) {

            View view = viewGroup.getChildAt(i);

            if (view instanceof EditText)
                ((EditText)view).setText("");

            if (view instanceof Spinner)
                ((Spinner)view).setSelected(false);

            if (view instanceof CheckBox)
                ((CheckBox)view).setChecked(false);
        }
    }
}
