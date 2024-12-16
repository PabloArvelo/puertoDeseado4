package com.puertodeseado.repositorio.anticipoderetorno;

import com.puertodeseado.entidades.anticiporetorno.LiquidacionHistorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface LiquidacionHistorialRepositorio extends JpaRepository<LiquidacionHistorial, String> {

  @Query(value = "SELECT periodo " +
          "FROM liquidacion_historial " +
          "ORDER BY STR_TO_DATE(CONCAT(periodo, '-01'), '%Y-%m-%d') DESC " +
          "LIMIT 1"
          ,nativeQuery = true)
  public String consultaUltimaLiquidacion ();

  // devuelve la lista de liquidaciones de un periodo
  @Query(value = "SELECT id, id_asociado, total_anticipo " +
          "FROM liquidacion_historial " +
          "WHERE periodo = :periodo"
          ,nativeQuery = true)
  public List<Object[]> buscarLiquidacionPorPeriodo(@Param("periodo") String periodo);

  // devuelve una liquuidación específica segun asociado y período
  @Query(value = "SELECT * " +
          "FROM liquidacion_historial " +
          "WHERE id_asociado = :idAsoc and periodo = :periodo"
          ,nativeQuery = true)
  public LiquidacionHistorial buscarLiquidacionPorAsocPeriodo(@Param("idAsoc") String idAsoc, @Param("periodo") String periodo);


  // actualiza el/los valores de una liquidación de un asociado específico y de un operíodo espcífico
  @Modifying
  @Query(value = "UPDATE liquidacion_historial SET " +
          "horas1 = :horas1, " +
          "minutos1 = :minutos1, " +
          "valor_hora1 = :valor_hora1, " +
          "objetivo1 = :objetivo1, " +
          "horas2 = :horas2, " +
          "minutos2 = :minutos2, " +
          "valor_hora2 = :valor_hora2, " +
          "objetivo2 = :objetivo2, " +
          "horas3 = :horas3, " +
          "minutos3 = :minutos3, " +
          "valor_hora3 = :valor_hora3, " +
          "objetivo3 = :objetivo3, " +
          "horas4 = :horas4, " +
          "minutos4 = :minutos4, " +
          "valor_hora4 = :valor_hora4, " +
          "objetivo4 = :objetivo4, " +
          "horas5 = :horas5, " +
          "minutos5 = :minutos5, " +
          "valor_hora5 = :valor_hora5, " +
          "objetivo5 = :objetivo5, " +
          "horas6 = :horas6, " +
          "minutos6 = :minutos6, " +
          "valor_hora6 = :valor_hora6, " +
          "objetivo6 = :objetivo6, " +
          "horas7 = :horas7, " +
          "minutos7 = :minutos7, " +
          "valor_hora7 = :valor_hora7, " +
          "objetivo7 = :objetivo7, " +
          "horas8 = :horas8, " +
          "minutos8 = :minutos8, " +
          "valor_hora8 = :valor_hora8, " +
          "objetivo8 = :objetivo8, " +
          "horas9 = :horas9, " +
          "minutos9 = :minutos9, " +
          "valor_hora9 = :valor_hora9, " +
          "objetivo9 = :objetivo9, " +
          "horas10 = :horas10, " +
          "minutos10 = :minutos10, " +
          "valor_hora10 = :valor_hora10, " +
          "objetivo10 = :objetivo10, " +
          "presentismo = :presentismo, " +
          "nocturnidad = :nocturnidad, " +
          "nocturnidad_eventual = :nocturnidad_eventual, " +
          "bonificacion_feriados = :bonificacion_feriados, " +
          "reconocimiento_horas = :reconocimiento_horas, " +
          "carpeta_medica = :carpeta_medica, " +
          "hs_vacaciones = :hs_vacaciones, " +
          "horas_adeudadas = :horas_adeudadas, " +
          "licencia_maternidad = :licencia_maternidad, " +
          "horas_practica = :horas_practica, " +
          "reintegro_cuotas_sociales = :reintegro_cuotas_sociales, " +
          "seguro_acc_per_vida = :seguro_acc_per_vida, " +
          "reten_monotri_per = :reten_monotri_per, " +
          "seguro_vida_oblig = :seguro_vida_oblig, " +
          "costo_habilitacion = :costo_habilitacion, " +
          "apto_psi_fi = :apto_psi_fi, " +
          "credisolcs = :credisolcs, " +
          "credisolcc = :credisolcc, " +
          "almacen = :almacen, " +
          "embargo_judicial = :embargo_judicial, " +
          "deposito_exceso = :deposito_exceso, " +
          "descuento_rotura_perdida = :descuento_rotura_perdida, " +
          "calzado = :calzado, " +
          "adherente_monotributo = :adherente_monotributo, " +
          "cuota_social = :cuota_social, " +
          "bonificaciones = :bonificaciones, " +
          "adelanto = :adelanto, " +
          "prestamo = :prestamo, " +
          "cuota_actual = :cuota_actual, " +
          "interes = :interes, " +
          "creditogupaserviciosas = :creditogupaserviciosas, " +
          "total_bruto = :total_bruto, " +
          "total_deducciones = :total_deducciones, " +
          "total_anticipo = :total_anticipo" +
          "WHERE id = :id_liqui", nativeQuery = true)
  public LiquidacionHistorial actualizarLiquidacionPorAsocPeriodo(@Param("horas1") int horas1,
                                                                  @Param("minutos1") int minutos1,
                                                                  @Param("valor_hora1")  BigDecimal valor_hora1,
                                                                  @Param("objetivo1") int objetivo1,
                                                                  @Param("horas2") int horas2,
                                                                  @Param("minutos2") int minutos2,
                                                                  @Param("valor_hora2") BigDecimal valor_hora2,
                                                                  @Param("objetivo2") int objetivo2,
                                                                  @Param("horas3") int horas3,
                                                                  @Param("minutos3") int minutos3,
                                                                  @Param("valor_hora3") BigDecimal valor_hora3,
                                                                  @Param("objetivo3") int objetivo3,
                                                                  @Param("horas4") int horas4,
                                                                  @Param("minutos4") int minutos4,
                                                                  @Param("valor_hora4") BigDecimal valor_hora4,
                                                                  @Param("objetivo4") int objetivo4,
                                                                  @Param("horas5") int horas5,
                                                                  @Param("minutos5") int minutos5,
                                                                  @Param("valor_hora5") BigDecimal valor_hora5,
                                                                  @Param("objetivo5") int objetivo5,
                                                                  @Param("horas6") int horas6,
                                                                  @Param("minutos6") int minutos6,
                                                                  @Param("valor_hora6") BigDecimal valor_hora6,
                                                                  @Param("objetivo6") int objetivo6,
                                                                  @Param("horas7") int horas7,
                                                                  @Param("minutos7") int minutos7,
                                                                  @Param("valor_hora7") BigDecimal valor_hora7,
                                                                  @Param("objetivo7") int objetivo7,
                                                                  @Param("horas8") int horas8,
                                                                  @Param("minutos8") int minutos8,
                                                                  @Param("valor_hora8") BigDecimal valor_hora8,
                                                                  @Param("objetivo8") int objetivo8,
                                                                  @Param("horas9") int horas9,
                                                                  @Param("minutos9") int minutos9,
                                                                  @Param("valor_hora9") BigDecimal valor_hora9,
                                                                  @Param("objetivo9") int objetivo9,
                                                                  @Param("horas10") int horas10,
                                                                  @Param("minutos10") int minutos10,
                                                                  @Param("valor_hora10") BigDecimal valor_hora10,
                                                                  @Param("objetivo10") int objetivo10,
                                                                  @Param("presentismo") double presentismo,
                                                                  @Param("nocturnidad") double nocturnidad,
                                                                  @Param("nocturnidad_eventual") double nocturnidad_eventual,
                                                                  @Param("bonificacion_feriados") double bonificacion_feriados,
                                                                  @Param("reconocimiento_horas") double reconocimiento_horas,
                                                                  @Param("carpeta_medica") double carpeta_medica,
                                                                  @Param("hs_vacaciones") double hs_vacaciones,
                                                                  @Param("horas_adeudadas") double horas_adeudadas,
                                                                  @Param("licencia_maternidad") double licencia_maternidad,
                                                                  @Param("horas_practica") double horas_practica,
                                                                  @Param("reintegro_cuotas_sociales") double reintegro_cuotas_sociales,
                                                                  @Param("seguro_acc_per_vida") double seguro_acc_per_vida,
                                                                  @Param("reten_monotri_per") double reten_monotri_per,
                                                                  @Param("seguro_vida_oblig") double seguro_vida_oblig,
                                                                  @Param("costo_habilitacion") double costo_habilitacion,
                                                                  @Param("apto_psi_fi") double apto_psi_fi,
                                                                  @Param("credisolcs") double credisolcs,
                                                                  @Param("credisolcc") double credisolcc,
                                                                  @Param("almacen") double almacen,
                                                                  @Param("embargo_judicial") double embargo_judicial,
                                                                  @Param("deposito_exceso") double deposito_exceso,
                                                                  @Param("descuento_rotura_perdida") double descuento_rotura_perdida,
                                                                  @Param("calzado") double calzado,
                                                                  @Param("adherente_monotributo") double adherente_monotributo,
                                                                  @Param("cuota_social") double cuota_social,
                                                                  @Param("bonificaciones") double bonificaciones,
                                                                  @Param("adelanto") double adelanto,
                                                                  @Param("prestamo") double prestamo,
                                                                  @Param("cuota_actual") double cuota_actual,
                                                                  @Param("interes") double interes,
                                                                  @Param("creditogupaserviciosas") double creditogupaserviciosas,
                                                                  @Param("total_bruto") BigDecimal total_bruto,
                                                                  @Param("total_deducciones") BigDecimal total_deducciones,
                                                                  @Param("total_anticipo") BigDecimal total_anticipo,
                                                                  @Param("id_liqui") String id_liqui);

}
