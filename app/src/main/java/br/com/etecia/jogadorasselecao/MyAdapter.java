package br.com.etecia.jogadorasselecao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Jogadoras> lstJogadoras;


    public MyAdapter(Context mContexto, List<Jogadoras> lstJogadoras) {
        this.mContexto = mContexto;
        this.lstJogadoras = lstJogadoras;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflate = LayoutInflater.from(mContexto);
        view= inflate.inflate(R.layout.modelo_jogadora, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        holder.idNomeJogadoras.setText(lstJogadoras.get(position).getNome());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView idCardJogadoras;

        ImageView idImagemJogadoras;

        TextView idNomeJogadoras, idTitulosJogadoras, idTimesJogadoras, idPosicao;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idCardJogadoras = itemView.findViewById(R.id.idCardJogadoras);
            idImagemJogadoras = itemView.findViewById(R.id.idImagemJogadoras);
            idNomeJogadoras = itemView.findViewById(R.id.idNomeJogadoras);
        }
    }
}
