package br.aula3.exemplolist;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ExemploListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] itens = new String[]{"Nome 1", "Nome 2", "Nome 3"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
            super.onListItemClick(l, v, position, id);

        Object o = this.getListAdapter().getItem(position);
        String item = o.toString();
        Toast.makeText(this, "Selecionado: " + item, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "ID: " + id, Toast.LENGTH_LONG).show();
    }
}
