package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Smart Speaker com Alexa - Cor Preta");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX522_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Novo-Echo-Dot-4%C2%AA-gera%C3%A7%C3%A3o/dp/B084DWCZY6/ref=zg-bs_electronics_sccl_3/146-5225773-2724513?pd_rd_w=oTEBs&content-id=amzn1.sym.c0c0f25f-aaf5-43d0-b46e-c8c2c04a86c2&pf_rd_p=c0c0f25f-aaf5-43d0-b46e-c8c2c04a86c2&pf_rd_r=0TG2XGDHE4VHMXQ1PPVH&pd_rd_wg=YUy5v&pd_rd_r=70e53f9c-3dd4-4c70-80e2-765f7045f2a1&pd_rd_i=B084DWCZY6&psc=1");
		pedido.setDescricao("descricao do produto");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
