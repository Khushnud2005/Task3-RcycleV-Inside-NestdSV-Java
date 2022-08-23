package uz.exemple.task3_rcyclev_inside_nestdsv_j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import uz.exemple.task3_rcyclev_inside_nestdsv_j.adapter.ItemAdapter;
import uz.exemple.task3_rcyclev_inside_nestdsv_j.model.DataModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Қизлар учун");
        nestedList1.add("Ўғил болалар учун");
        nestedList1.add("Аёллар учун");
        nestedList1.add("Эркаклар учун");
        nestedList1.add("Оиладаги хаммага");
        nestedList1.add("Сумка ва Рюкзаклар");
        nestedList1.add("Пойабзаллар ва Этиклар");
        nestedList1.add("Зонтиклар ва ёмғирпўшлар");

        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Пишириш учун идишлар");
        nestedList2.add("Сервировка");
        nestedList2.add("Махсулот сақлагичлар");
        nestedList2.add("Идиши қуритгачлар");
        nestedList2.add("Сув филтрлари");
        nestedList2.add("Холодилниклар");
        nestedList2.add("Газ плиталари");
        nestedList2.add("Раковина ва сместителлар");

        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("Ноутбук ва Аксесуарлар");
        nestedList3.add("Десктоплар ва Моноблоклар");
        nestedList3.add("Компютер учун аксессуарлар");
        nestedList3.add("Компютер жихозлари");
        nestedList3.add("Офис жихозлари");
        nestedList3.add("Сет учун қурилмалар");

        List<String> nestedList4 = new ArrayList<>();


        mList.add(new DataModel(nestedList1,"Кийим, пойабзал ва аксессуарлар"));
        mList.add(new DataModel(nestedList2,"Ошхона Жихозлари"));
        mList.add(new DataModel(nestedList3,"Компьютерлар ва оргтехника"));
        mList.add(new DataModel(nestedList4,"Уй ва Офис учун"));
        mList.add(new DataModel(nestedList3,"Телефонлар ва Гаджетлар"));
        mList.add(new DataModel(nestedList2,"Китоблар"));
        mList.add(new DataModel(nestedList1,"Мебел"));

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);

    }
}