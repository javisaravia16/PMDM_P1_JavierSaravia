package es.medac.javier.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Pantalla principal: partidos del día.
 * Solo interfaz: los datos son de ejemplo y todos los textos salen de strings.xml.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Textos con parámetros (%1$s, %1$d, %2$d) definidos en strings.xml
        TextView tvSaludo = findViewById(R.id.tvSaludo);
        tvSaludo.setText(getString(R.string.saludo, getString(R.string.usuario_invitado)));

        TextView tvPartidosHoy = findViewById(R.id.tvPartidosHoy);
        tvPartidosHoy.setText(getString(R.string.partidos_hoy, 3));

        TextView tvEstado1 = findViewById(R.id.tvEstado1);
        tvEstado1.setText(getString(R.string.estado_en_directo, 78));
        TextView tvMarcador1 = findViewById(R.id.tvMarcador1);
        tvMarcador1.setText(getString(R.string.marcador, 2, 1));

        TextView tvMarcador2 = findViewById(R.id.tvMarcador2);
        tvMarcador2.setText(getString(R.string.marcador, 1, 1));

        TextView tvEstado3 = findViewById(R.id.tvEstado3);
        tvEstado3.setText(getString(R.string.estado_proximo, getString(R.string.hora_partido)));

        TextView tvActualizado = findViewById(R.id.tvActualizado);
        tvActualizado.setText(getString(R.string.ultima_actualizacion, 1));

        // Navegación a la pantalla de detalle
        View.OnClickListener abrirDetalle =
                v -> startActivity(new Intent(this, DetalleActivity.class));
        findViewById(R.id.btnVerDetalle).setOnClickListener(abrirDetalle);
        findViewById(R.id.cardPartido1).setOnClickListener(abrirDetalle);
    }
}
