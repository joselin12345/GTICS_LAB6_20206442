package com.example.lab6_gtics_20206442.Controllers;

import com.example.lab6_gtics_20206442.Entity.Site;
import com.example.lab6_gtics_20206442.Repository.LocationsRepository;
import com.example.lab6_gtics_20206442.Repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@RequestMapping("/sitios")
@Controller
public class SitiosControllers {

    @Autowired
    SiteRepository siteRepository;
    @Autowired
    LocationsRepository locationsRepository;

    @GetMapping(value = {"","/list"})
    public String principal(Model model){
        model.addAttribute("listaSitios",siteRepository.findAll());
        return "sitios/principal";
    }

    @GetMapping("/new")
    public String nuevoSitio(Model model) {
        model.addAttribute("listaLocation", locationsRepository.findAll());
        return "sitios/nuevo";
    }
    @PostMapping("/save")
    public String guardarSitio(Site sitio, RedirectAttributes attr) {
        String estado = sitio.getSiteID() == null ? "creado" : "actualizado";
        attr.addFlashAttribute("msg", "Sitio " + estado + " correctamente");
        siteRepository.save(sitio);
        return "redirect:/sitios/list";
    }

    @GetMapping("/delete")
    public String borrarTransportista(@RequestParam("id") int id) {

        Optional<Site> optionalSite = siteRepository.findById(id);

        if (optionalSite.isPresent()) {
            siteRepository.deleteById(id);
        }
        return "redirect:/sitios/list";

    }

}
