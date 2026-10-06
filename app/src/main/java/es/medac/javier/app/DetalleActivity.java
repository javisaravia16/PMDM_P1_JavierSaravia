package es.medac.javier.app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Pantalla de detalle de un partido. Solo interfaz con datos de ejemplo.
 */
public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView tvEstado = findViewById(R.id.tvEstadoDetalle);
        tvEstado.setText(getString(R.string.estado_en_directo, 78));

        TextView tvMarcador = findViewById(R.id.tvMarcadorDetalle);
        tvMarcador.setText(getString(R.string.marcador, 2, 1));

        TextView tvEstadio = findViewById(R.id.tvEstadio);
        tvEstadio.setText(getString(R.string.estadio, getString(R.string.estadio_villamarin)));

        findViewById(R.id.btnVolver).setOnClickListener(v -> finish());
    }
}
