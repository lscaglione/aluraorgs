package br.com.lucca.orgs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.lucca.aluraorg.R
import br.com.lucca.orgs.model.Produto
import br.com.lucca.orgs.recyclerView.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de Frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maçã"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(
                nome = "teste",
                descricao = "test desc",
                valor = BigDecimal("19.99")
            ),
            Produto(
                nome = "teste 1",
                descricao = "test desc 1",
                valor = BigDecimal("29.99")
            ),
            Produto(
                nome = "teste 2",
                descricao = "test desc 2",
                valor = BigDecimal("39.99")
            )

        ))
//        recyclerView.layoutManager = LinearLayoutManager(this)




    }
}