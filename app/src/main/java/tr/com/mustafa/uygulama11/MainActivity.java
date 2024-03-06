package tr.com.mustafa.uygulama11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import tr.com.mustafa.uygulama11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);


        gorselArrayList = new ArrayList<>();

        Gorsel insan =new Gorsel("Yakışıklı Bir İnsan",1,R.drawable.insan);
        Gorsel okyanus=new Gorsel("Mavi Okyanus",2,R.drawable.okyanus);
        Gorsel sislisehir=new Gorsel("Sise Gömülmüş Şehir",3,R.drawable.sislisehir);
        Gorsel yolresmi=new Gorsel("Ucu Bucağı Olmayan Yol",4,R.drawable.yolresmi);

        gorselArrayList.add(insan);
        gorselArrayList.add(okyanus);
        gorselArrayList.add(sislisehir);
        gorselArrayList.add(yolresmi);

        binding.imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(0).bilgi);


    }

    public void ileriGitme(View view)
    {
        if(seciliSiraNo<gorselArrayList.size()-1){
            seciliSiraNo++;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    public void geriGelme(View view)
    {
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }
}