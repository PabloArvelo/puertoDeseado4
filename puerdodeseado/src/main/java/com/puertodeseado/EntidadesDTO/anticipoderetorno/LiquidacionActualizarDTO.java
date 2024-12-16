package com.puertodeseado.EntidadesDTO.anticipoderetorno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.YearMonth;

public class LiquidacionActualizarDTO {

  @NotNull
  private int horas1;
  private int minutos1;
  private BigDecimal valor_hora1;
  private int objetivo1;
  private int horas2;
  private int minutos2;
  private BigDecimal valor_hora2;
  private int objetivo2;
  private int horas3;
  private int minutos3;
  private BigDecimal valor_hora3;
  private int objetivo3;
  private int horas4;
  private int minutos4;
  private BigDecimal valor_hora4;
  private int objetivo4;
  private int horas5;
  private int minutos5;
  private BigDecimal valor_hora5;
  private int objetivo5;
  private int horas6;
  private int minutos6;
  private BigDecimal valor_hora6;
  private int objetivo6;
  private int horas7;
  private int minutos7;
  private BigDecimal valor_hora7;
  private int objetivo7;
  private int horas8;
  private int minutos8;
  private BigDecimal valor_hora8;
  private int objetivo8;
  private int horas9;
  private int minutos9;
  private BigDecimal valor_hora9;
  private int objetivo9;
  private int horas10;
  private int minutos10;
  private BigDecimal valor_hora10;
  private int objetivo10;
  private double presentismo;
  private double nocturnidad;
  private double nocturnidad_eventual;
  private double bonificacion_feriados;
  private double reconocimiento_horas;
  private double carpeta_medica;
  private double hs_vacaciones;
  private double horas_adeudadas;
  private double licencia_maternidad;
  private double horas_practica;
  private double reintegro_cuotas_sociales;
  private double seguro_acc_per_vida;
  private double reten_monotri_per;
  private double seguro_vida_oblig;
  private double costo_habilitacion;
  private double apto_psi_fi;
  private double credisolcs;
  private double credisolcc;
  private double almacen;
  private double embargo_judicial;
  private double deposito_exceso;
  private double descuento_rotura_perdida;
  private double calzado;
  private double adherente_monotributo;
  private double cuota_social;
  private double bonificaciones;
  private double adelanto;
  @NotNull(message = "no puede ser nulo")
  private double prestamo;
  private String cuota_actual;
  private double interes;
  private double creditogupaserviciosas;
  private String idLiquidacion;
  private String idAsociado;
  private YearMonth periodo;

  public LiquidacionActualizarDTO() {
  }

  public LiquidacionActualizarDTO(int horas1, int minutos1, BigDecimal valor_hora1, int objetivo1, int horas2, int minutos2, BigDecimal valor_hora2, int objetivo2, int horas3, int minutos3, BigDecimal valor_hora3, int objetivo3, int horas4, int minutos4, BigDecimal valor_hora4, int objetivo4, int horas5, int minutos5, BigDecimal valor_hora5, int objetivo5, int horas6, int minutos6, BigDecimal valor_hora6, int objetivo6, int horas7, int minutos7, BigDecimal valor_hora7, int objetivo7, int horas8, int minutos8, BigDecimal valor_hora8, int objetivo8, int horas9, int minutos9, BigDecimal valor_hora9, int objetivo9, int horas10, int minutos10, BigDecimal valor_hora10, int objetivo10, double presentismo, double nocturnidad, double nocturnidad_eventual, double bonificacion_feriados, double reconocimiento_horas, double carpeta_medica, double hs_vacaciones, double horas_adeudadas, double licencia_maternidad, double horas_practica, double reintegro_cuotas_sociales, double seguro_acc_per_vida, double reten_monotri_per, double seguro_vida_oblig, double costo_habilitacion, double apto_psi_fi, double credisolcs, double credisolcc, double almacen, double embargo_judicial, double deposito_exceso, double descuento_rotura_perdida, double calzado, double adherente_monotributo, double cuota_social, double bonificaciones, double adelanto, double prestamo, String cuota_actual, double interes, double creditogupaserviciosas, String idLiquidacion, String idAsociado, YearMonth periodo) {
    this.horas1 = horas1;
    this.minutos1 = minutos1;
    this.valor_hora1 = valor_hora1;
    this.objetivo1 = objetivo1;
    this.horas2 = horas2;
    this.minutos2 = minutos2;
    this.valor_hora2 = valor_hora2;
    this.objetivo2 = objetivo2;
    this.horas3 = horas3;
    this.minutos3 = minutos3;
    this.valor_hora3 = valor_hora3;
    this.objetivo3 = objetivo3;
    this.horas4 = horas4;
    this.minutos4 = minutos4;
    this.valor_hora4 = valor_hora4;
    this.objetivo4 = objetivo4;
    this.horas5 = horas5;
    this.minutos5 = minutos5;
    this.valor_hora5 = valor_hora5;
    this.objetivo5 = objetivo5;
    this.horas6 = horas6;
    this.minutos6 = minutos6;
    this.valor_hora6 = valor_hora6;
    this.objetivo6 = objetivo6;
    this.horas7 = horas7;
    this.minutos7 = minutos7;
    this.valor_hora7 = valor_hora7;
    this.objetivo7 = objetivo7;
    this.horas8 = horas8;
    this.minutos8 = minutos8;
    this.valor_hora8 = valor_hora8;
    this.objetivo8 = objetivo8;
    this.horas9 = horas9;
    this.minutos9 = minutos9;
    this.valor_hora9 = valor_hora9;
    this.objetivo9 = objetivo9;
    this.horas10 = horas10;
    this.minutos10 = minutos10;
    this.valor_hora10 = valor_hora10;
    this.objetivo10 = objetivo10;
    this.presentismo = presentismo;
    this.nocturnidad = nocturnidad;
    this.nocturnidad_eventual = nocturnidad_eventual;
    this.bonificacion_feriados = bonificacion_feriados;
    this.reconocimiento_horas = reconocimiento_horas;
    this.carpeta_medica = carpeta_medica;
    this.hs_vacaciones = hs_vacaciones;
    this.horas_adeudadas = horas_adeudadas;
    this.licencia_maternidad = licencia_maternidad;
    this.horas_practica = horas_practica;
    this.reintegro_cuotas_sociales = reintegro_cuotas_sociales;
    this.seguro_acc_per_vida = seguro_acc_per_vida;
    this.reten_monotri_per = reten_monotri_per;
    this.seguro_vida_oblig = seguro_vida_oblig;
    this.costo_habilitacion = costo_habilitacion;
    this.apto_psi_fi = apto_psi_fi;
    this.credisolcs = credisolcs;
    this.credisolcc = credisolcc;
    this.almacen = almacen;
    this.embargo_judicial = embargo_judicial;
    this.deposito_exceso = deposito_exceso;
    this.descuento_rotura_perdida = descuento_rotura_perdida;
    this.calzado = calzado;
    this.adherente_monotributo = adherente_monotributo;
    this.cuota_social = cuota_social;
    this.bonificaciones = bonificaciones;
    this.adelanto = adelanto;
    this.prestamo = prestamo;
    this.cuota_actual = cuota_actual;
    this.interes = interes;
    this.creditogupaserviciosas = creditogupaserviciosas;
    this.idLiquidacion = idLiquidacion;
    this.idAsociado = idAsociado;
    this.periodo = periodo;
  }

  public int getHoras1() {
    return horas1;
  }

  public void setHoras1(int horas1) {
    this.horas1 = horas1;
  }

  public int getMinutos1() {
    return minutos1;
  }

  public void setMinutos1(int minutos1) {
    this.minutos1 = minutos1;
  }

  public BigDecimal getValor_hora1() {
    return valor_hora1;
  }

  public void setValor_hora1(BigDecimal valor_hora1) {
    this.valor_hora1 = valor_hora1;
  }

  public int getObjetivo1() {
    return objetivo1;
  }

  public void setObjetivo1(int objetivo1) {
    this.objetivo1 = objetivo1;
  }

  public int getHoras2() {
    return horas2;
  }

  public void setHoras2(int horas2) {
    this.horas2 = horas2;
  }

  public int getMinutos2() {
    return minutos2;
  }

  public void setMinutos2(int minutos2) {
    this.minutos2 = minutos2;
  }

  public BigDecimal getValor_hora2() {
    return valor_hora2;
  }

  public void setValor_hora2(BigDecimal valor_hora2) {
    this.valor_hora2 = valor_hora2;
  }

  public int getObjetivo2() {
    return objetivo2;
  }

  public void setObjetivo2(int objetivo2) {
    this.objetivo2 = objetivo2;
  }

  public int getHoras3() {
    return horas3;
  }

  public void setHoras3(int horas3) {
    this.horas3 = horas3;
  }

  public int getMinutos3() {
    return minutos3;
  }

  public void setMinutos3(int minutos3) {
    this.minutos3 = minutos3;
  }

  public BigDecimal getValor_hora3() {
    return valor_hora3;
  }

  public void setValor_hora3(BigDecimal valor_hora3) {
    this.valor_hora3 = valor_hora3;
  }

  public int getObjetivo3() {
    return objetivo3;
  }

  public void setObjetivo3(int objetivo3) {
    this.objetivo3 = objetivo3;
  }

  public int getHoras4() {
    return horas4;
  }

  public void setHoras4(int horas4) {
    this.horas4 = horas4;
  }

  public int getMinutos4() {
    return minutos4;
  }

  public void setMinutos4(int minutos4) {
    this.minutos4 = minutos4;
  }

  public BigDecimal getValor_hora4() {
    return valor_hora4;
  }

  public void setValor_hora4(BigDecimal valor_hora4) {
    this.valor_hora4 = valor_hora4;
  }

  public int getObjetivo4() {
    return objetivo4;
  }

  public void setObjetivo4(int objetivo4) {
    this.objetivo4 = objetivo4;
  }

  public int getHoras5() {
    return horas5;
  }

  public void setHoras5(int horas5) {
    this.horas5 = horas5;
  }

  public int getMinutos5() {
    return minutos5;
  }

  public void setMinutos5(int minutos5) {
    this.minutos5 = minutos5;
  }

  public BigDecimal getValor_hora5() {
    return valor_hora5;
  }

  public void setValor_hora5(BigDecimal valor_hora5) {
    this.valor_hora5 = valor_hora5;
  }

  public int getObjetivo5() {
    return objetivo5;
  }

  public void setObjetivo5(int objetivo5) {
    this.objetivo5 = objetivo5;
  }

  public int getHoras6() {
    return horas6;
  }

  public void setHoras6(int horas6) {
    this.horas6 = horas6;
  }

  public int getMinutos6() {
    return minutos6;
  }

  public void setMinutos6(int minutos6) {
    this.minutos6 = minutos6;
  }

  public BigDecimal getValor_hora6() {
    return valor_hora6;
  }

  public void setValor_hora6(BigDecimal valor_hora6) {
    this.valor_hora6 = valor_hora6;
  }

  public int getObjetivo6() {
    return objetivo6;
  }

  public void setObjetivo6(int objetivo6) {
    this.objetivo6 = objetivo6;
  }

  public int getHoras7() {
    return horas7;
  }

  public void setHoras7(int horas7) {
    this.horas7 = horas7;
  }

  public int getMinutos7() {
    return minutos7;
  }

  public void setMinutos7(int minutos7) {
    this.minutos7 = minutos7;
  }

  public BigDecimal getValor_hora7() {
    return valor_hora7;
  }

  public void setValor_hora7(BigDecimal valor_hora7) {
    this.valor_hora7 = valor_hora7;
  }

  public int getObjetivo7() {
    return objetivo7;
  }

  public void setObjetivo7(int objetivo7) {
    this.objetivo7 = objetivo7;
  }

  public int getHoras8() {
    return horas8;
  }

  public void setHoras8(int horas8) {
    this.horas8 = horas8;
  }

  public int getMinutos8() {
    return minutos8;
  }

  public void setMinutos8(int minutos8) {
    this.minutos8 = minutos8;
  }

  public BigDecimal getValor_hora8() {
    return valor_hora8;
  }

  public void setValor_hora8(BigDecimal valor_hora8) {
    this.valor_hora8 = valor_hora8;
  }

  public int getObjetivo8() {
    return objetivo8;
  }

  public void setObjetivo8(int objetivo8) {
    this.objetivo8 = objetivo8;
  }

  public int getHoras9() {
    return horas9;
  }

  public void setHoras9(int horas9) {
    this.horas9 = horas9;
  }

  public int getMinutos9() {
    return minutos9;
  }

  public void setMinutos9(int minutos9) {
    this.minutos9 = minutos9;
  }

  public BigDecimal getValor_hora9() {
    return valor_hora9;
  }

  public void setValor_hora9(BigDecimal valor_hora9) {
    this.valor_hora9 = valor_hora9;
  }

  public int getObjetivo9() {
    return objetivo9;
  }

  public void setObjetivo9(int objetivo9) {
    this.objetivo9 = objetivo9;
  }

  public int getHoras10() {
    return horas10;
  }

  public void setHoras10(int horas10) {
    this.horas10 = horas10;
  }

  public int getMinutos10() {
    return minutos10;
  }

  public void setMinutos10(int minutos10) {
    this.minutos10 = minutos10;
  }

  public BigDecimal getValor_hora10() {
    return valor_hora10;
  }

  public void setValor_hora10(BigDecimal valor_hora10) {
    this.valor_hora10 = valor_hora10;
  }

  public int getObjetivo10() {
    return objetivo10;
  }

  public void setObjetivo10(int objetivo10) {
    this.objetivo10 = objetivo10;
  }

  public double getPresentismo() {
    return presentismo;
  }

  public void setPresentismo(double presentismo) {
    this.presentismo = presentismo;
  }

  public double getNocturnidad() {
    return nocturnidad;
  }

  public void setNocturnidad(double nocturnidad) {
    this.nocturnidad = nocturnidad;
  }

  public double getNocturnidad_eventual() {
    return nocturnidad_eventual;
  }

  public void setNocturnidad_eventual(double nocturnidad_eventual) {
    this.nocturnidad_eventual = nocturnidad_eventual;
  }

  public double getBonificacion_feriados() {
    return bonificacion_feriados;
  }

  public void setBonificacion_feriados(double bonificacion_feriados) {
    this.bonificacion_feriados = bonificacion_feriados;
  }

  public double getReconocimiento_horas() {
    return reconocimiento_horas;
  }

  public void setReconocimiento_horas(double reconocimiento_horas) {
    this.reconocimiento_horas = reconocimiento_horas;
  }

  public double getCarpeta_medica() {
    return carpeta_medica;
  }

  public void setCarpeta_medica(double carpeta_medica) {
    this.carpeta_medica = carpeta_medica;
  }

  public double getHs_vacaciones() {
    return hs_vacaciones;
  }

  public void setHs_vacaciones(double hs_vacaciones) {
    this.hs_vacaciones = hs_vacaciones;
  }

  public double getHoras_adeudadas() {
    return horas_adeudadas;
  }

  public void setHoras_adeudadas(double horas_adeudadas) {
    this.horas_adeudadas = horas_adeudadas;
  }

  public double getLicencia_maternidad() {
    return licencia_maternidad;
  }

  public void setLicencia_maternidad(double licencia_maternidad) {
    this.licencia_maternidad = licencia_maternidad;
  }

  public double getHoras_practica() {
    return horas_practica;
  }

  public void setHoras_practica(double horas_practica) {
    this.horas_practica = horas_practica;
  }

  public double getReintegro_cuotas_sociales() {
    return reintegro_cuotas_sociales;
  }

  public void setReintegro_cuotas_sociales(double reintegro_cuotas_sociales) {
    this.reintegro_cuotas_sociales = reintegro_cuotas_sociales;
  }

  public double getSeguro_acc_per_vida() {
    return seguro_acc_per_vida;
  }

  public void setSeguro_acc_per_vida(double seguro_acc_per_vida) {
    this.seguro_acc_per_vida = seguro_acc_per_vida;
  }

  public double getReten_monotri_per() {
    return reten_monotri_per;
  }

  public void setReten_monotri_per(double reten_monotri_per) {
    this.reten_monotri_per = reten_monotri_per;
  }

  public double getSeguro_vida_oblig() {
    return seguro_vida_oblig;
  }

  public void setSeguro_vida_oblig(double seguro_vida_oblig) {
    this.seguro_vida_oblig = seguro_vida_oblig;
  }

  public double getCosto_habilitacion() {
    return costo_habilitacion;
  }

  public void setCosto_habilitacion(double costo_habilitacion) {
    this.costo_habilitacion = costo_habilitacion;
  }

  public double getApto_psi_fi() {
    return apto_psi_fi;
  }

  public void setApto_psi_fi(double apto_psi_fi) {
    this.apto_psi_fi = apto_psi_fi;
  }

  public double getCredisolcs() {
    return credisolcs;
  }

  public void setCredisolcs(double credisolcs) {
    this.credisolcs = credisolcs;
  }

  public double getCredisolcc() {
    return credisolcc;
  }

  public void setCredisolcc(double credisolcc) {
    this.credisolcc = credisolcc;
  }

  public double getAlmacen() {
    return almacen;
  }

  public void setAlmacen(double almacen) {
    this.almacen = almacen;
  }

  public double getEmbargo_judicial() {
    return embargo_judicial;
  }

  public void setEmbargo_judicial(double embargo_judicial) {
    this.embargo_judicial = embargo_judicial;
  }

  public double getDeposito_exceso() {
    return deposito_exceso;
  }

  public void setDeposito_exceso(double deposito_exceso) {
    this.deposito_exceso = deposito_exceso;
  }

  public double getDescuento_rotura_perdida() {
    return descuento_rotura_perdida;
  }

  public void setDescuento_rotura_perdida(double descuento_rotura_perdida) {
    this.descuento_rotura_perdida = descuento_rotura_perdida;
  }

  public double getCalzado() {
    return calzado;
  }

  public void setCalzado(double calzado) {
    this.calzado = calzado;
  }

  public double getAdherente_monotributo() {
    return adherente_monotributo;
  }

  public void setAdherente_monotributo(double adherente_monotributo) {
    this.adherente_monotributo = adherente_monotributo;
  }

  public double getCuota_social() {
    return cuota_social;
  }

  public void setCuota_social(double cuota_social) {
    this.cuota_social = cuota_social;
  }

  public double getBonificaciones() {
    return bonificaciones;
  }

  public void setBonificaciones(double bonificaciones) {
    this.bonificaciones = bonificaciones;
  }

  public double getAdelanto() {
    return adelanto;
  }

  public void setAdelanto(double adelanto) {
    this.adelanto = adelanto;
  }

  public double getPrestamo() {
    return prestamo;
  }

  public void setPrestamo(double prestamo) {
    this.prestamo = prestamo;
  }

  public String getCuota_actual() {
    return cuota_actual;
  }

  public void setCuota_actual(String cuota_actual) {
    this.cuota_actual = cuota_actual;
  }

  public double getInteres() {
    return interes;
  }

  public void setInteres(double interes) {
    this.interes = interes;
  }

  public double getCreditogupaserviciosas() {
    return creditogupaserviciosas;
  }

  public void setCreditogupaserviciosas(double creditogupaserviciosas) {
    this.creditogupaserviciosas = creditogupaserviciosas;
  }

  public String getIdLiquidacion() {
    return idLiquidacion;
  }

  public void setIdLiquidacion(String idLiquidacion) {
    this.idLiquidacion = idLiquidacion;
  }

  public String getIdAsociado() {
    return idAsociado;
  }

  public void setIdAsociado(String idAsociado) {
    this.idAsociado = idAsociado;
  }

  public YearMonth getPeriodo() {
    return periodo;
  }

  public void setPeriodo(YearMonth periodo) {
    this.periodo = periodo;
  }
}
