package best.hyun.pgrc.type

import android.graphics.Color
import best.hyun.pgrc.App.Companion.getString
import best.hyun.pgrc.R
import best.hyun.pgrc.type.PET_TYPE.*


enum class ELEMENTAL { EARTH, WATER, FIRE, WIND }

enum class ELEMENTAL_COLOR(val rgb: Int) {
    EARTH(Color.rgb(0,180,0)),
    WATER(Color.BLUE),
    FIRE(Color.RED),
    WIND(Color.rgb(230,190,0))
}

enum class PET_TYPE(val serialNumber:Int, val typeName:String) {
    SPECIAL(100, getString(R.string.type_special)),
    FOURGUARDIANSOGDS(200, getString(R.string.type_fourguardiangods)),
    WEREWOLF(300, getString(R.string.type_werewolf)),
    BEAST(400, getString(R.string.type_beast)),
    YANGIRO(500,  getString(R.string.type_yangiro)),
    OGAROS(600, getString(R.string.type_ogaros)),
    SAMDUSA(700, getString(R.string.type_samdusa)),
    HYUBO(800, getString(R.string.type_hyubo)),
    BUBI(900, getString(R.string.type_bubi)),
    KATARKAS(1000, getString(R.string.type_katarkas)),
    MANMO(1100, getString(R.string.type_manmo)),
    GIGAROS(1200, getString(R.string.type_gigaros)),
    SNAKE(1300, getString(R.string.type_snake)),
    DOG(1400, getString(R.string.type_dog)),
    ZYAG(1500, getString(R.string.type_zyag)),
    BERGA(1600, getString(R.string.type_berga)),
    DAINO(1700, getString(R.string.type_daino)),
    WOOPU2D(1800, getString(R.string.type_woopu2d)),
    WOOPU(1900, getString(R.string.type_woopu2d)),
    DORABIS(2000, getString(R.string.type_dorabys)),
    KUKURU(2100, getString(R.string.type_kukuru)),
    BERON(2200, getString(R.string.type_beron)),
    GORDON(2300, getString(R.string.type_gordon)),
    NEGOS(2400, getString(R.string.type_negos)),
    MUI(2500, getString(R.string.type_mui)),
    KKOMI(2600, getString(R.string.type_kkomi)),
    KAKU(2700, getString(R.string.type_kaku)),
    NOSTOROS(2800, getString(R.string.type_nostoros)),
    TORA(2900, getString(R.string.type_tora)),
    KAKI(3000, getString(R.string.type_kaku)),
    STORAJI(3100, getString(R.string.type_storaji)),
    PENTAS(3200, getString(R.string.type_pentas)),
    LAGOGO(3300, getString(R.string.type_lagogo)),
    BOOGI(3400, getString(R.string.type_boogi)),
    DOORI(3500, getString(R.string.type_doori)),
    RARE(3600, getString(R.string.type_rare)),
    KEIBEE(3700, getString(R.string.type_keibee)),
    MONASIPU(3800, getString(R.string.type_monasipu)),
    MARABIA(3900, getString(R.string.type_marabia)),
    GODSNAKE(4000, getString(R.string.type_godsnake))
    ;

    override fun toString(): String = typeName
}

fun getSerialNumber(name:String) :Int {
    when(name) {
        getString(R.string.name_laiby) -> { return SPECIAL.serialNumber + 1 }
        getString(R.string.name_bokwoori) -> { return SPECIAL.serialNumber + 2 }
        getString(R.string.name_fywable) -> { return SPECIAL.serialNumber + 3 }
        getString(R.string.name_peruru) -> { return SPECIAL.serialNumber + 4 }
        getString(R.string.name_dorudoru) -> { return SPECIAL.serialNumber + 5 }
        getString(R.string.name_youngicedragon) -> { return SPECIAL.serialNumber + 6 }
        getString(R.string.name_kawoo) -> { return SPECIAL.serialNumber + 7 }
        getString(R.string.name_hubaty) -> { return SPECIAL.serialNumber + 8 }

        getString(R.string.name_whitetiger) -> { return FOURGUARDIANSOGDS.serialNumber + 1}
        getString(R.string.name_redbird) -> { return FOURGUARDIANSOGDS.serialNumber + 2}
        getString(R.string.name_blacktortoise) -> { return FOURGUARDIANSOGDS.serialNumber + 3}
        getString(R.string.name_bluedragon) -> { return FOURGUARDIANSOGDS.serialNumber + 4}

        getString(R.string.name_earthwerewolf) -> { return WEREWOLF.serialNumber + 1 }
        getString(R.string.name_waterwerewolf) -> { return WEREWOLF.serialNumber + 2 }
        getString(R.string.name_firewerewolf) -> { return WEREWOLF.serialNumber + 3 }
        getString(R.string.name_windwerewolf) -> { return WEREWOLF.serialNumber + 4 }

        getString(R.string.name_earthhorse) -> { return BEAST.serialNumber + 1 }
        getString(R.string.name_waterhorse) -> { return BEAST.serialNumber + 2 }
        getString(R.string.name_firehorse) -> { return BEAST.serialNumber + 3 }
        getString(R.string.name_windhorse) -> { return BEAST.serialNumber + 4 }
        getString(R.string.name_mecaearthhorse) -> { return BEAST.serialNumber + 5 }
        getString(R.string.name_mecawaterhorse) -> { return BEAST.serialNumber + 6 }
        getString(R.string.name_mecafirehorse) -> { return BEAST.serialNumber + 7 }
        getString(R.string.name_mecawindhorse) -> { return BEAST.serialNumber + 8 }
        getString(R.string.name_earthmouse) -> { return BEAST.serialNumber + 9 }
        getString(R.string.name_watermouse) -> { return BEAST.serialNumber + 10 }
        getString(R.string.name_firemouse) -> { return BEAST.serialNumber + 11 }
        getString(R.string.name_windmouse) -> { return BEAST.serialNumber + 12 }

        getString(R.string.name_libino) -> { return YANGIRO.serialNumber + 1}
        getString(R.string.name_yangiro) -> { return YANGIRO.serialNumber + 2}
        getString(R.string.name_banboro) -> { return YANGIRO.serialNumber + 3}
        getString(R.string.name_bangino) -> { return YANGIRO.serialNumber + 4}
        getString(R.string.name_burudon) -> { return YANGIRO.serialNumber + 5}
        getString(R.string.name_gibino) -> { return YANGIRO.serialNumber + 6}
        getString(R.string.name_bino) -> { return YANGIRO.serialNumber + 7}
        getString(R.string.name_giro) -> { return YANGIRO.serialNumber + 8}
        getString(R.string.name_boro) -> { return YANGIRO.serialNumber + 9}
        getString(R.string.name_gino) -> { return YANGIRO.serialNumber + 10}
        getString(R.string.name_rudon) -> { return YANGIRO.serialNumber + 11}
        getString(R.string.name_ssagat) -> { return YANGIRO.serialNumber + 12}
        getString(R.string.name_teinos) -> { return YANGIRO.serialNumber + 13}

        getString(R.string.name_ogaros) -> { return OGAROS.serialNumber + 1}
        getString(R.string.name_orgon) -> { return OGAROS.serialNumber + 2}
        getString(R.string.name_mogaros) -> { return OGAROS.serialNumber + 3}
        getString(R.string.name_golos) -> { return OGAROS.serialNumber + 4}
        getString(R.string.name_norgon) -> { return OGAROS.serialNumber + 5}
        getString(R.string.name_pooryong) -> { return OGAROS.serialNumber + 6}
        getString(R.string.name_jigaros) -> { return OGAROS.serialNumber + 7}
        getString(R.string.name_kalos) -> { return OGAROS.serialNumber + 8}

        getString(R.string.name_jidusa) -> { return SAMDUSA.serialNumber + 1}
        getString(R.string.name_sudusa) -> { return SAMDUSA.serialNumber + 2}
        getString(R.string.name_hwadusa) -> { return SAMDUSA.serialNumber + 3}
        getString(R.string.name_poongdusa) -> { return SAMDUSA.serialNumber + 4}

        getString(R.string.name_hyubo) -> { return HYUBO.serialNumber + 1 }
        getString(R.string.name_pobo) -> { return HYUBO.serialNumber + 2 }
        getString(R.string.name_kubo) -> { return HYUBO.serialNumber + 3 }
        getString(R.string.name_torojya) -> { return HYUBO.serialNumber + 4 }
        getString(R.string.name_burubo) -> { return HYUBO.serialNumber + 5 }

        getString(R.string.name_bubi) -> { return BUBI.serialNumber + 1 }
        getString(R.string.name_goldbubi) -> { return BUBI.serialNumber + 2 }
        getString(R.string.name_bui) -> { return BUBI.serialNumber + 3 }
        getString(R.string.name_buibee) -> { return BUBI.serialNumber + 4 }
        getString(R.string.name_kingbui) -> { return BUBI.serialNumber + 5 }

        getString(R.string.name_katarkas) -> { return KATARKAS.serialNumber + 1 }
        getString(R.string.name_kukas) -> { return KATARKAS.serialNumber + 2 }
        getString(R.string.name_korokas) -> { return KATARKAS.serialNumber + 3 }
        getString(R.string.name_logian) -> { return KATARKAS.serialNumber + 4 }
        getString(R.string.name_lamgas) -> { return KATARKAS.serialNumber + 5 }
        getString(R.string.name_aikas) -> { return KATARKAS.serialNumber + 6 }
        getString(R.string.name_kutas) -> { return KATARKAS.serialNumber + 7 }
        getString(R.string.name_kargian) -> { return KATARKAS.serialNumber + 8 }

        getString(R.string.name_manmo) -> { return MANMO.serialNumber + 1 }
        getString(R.string.name_manmoru) -> { return MANMO.serialNumber + 2 }
        getString(R.string.name_manmonas) -> { return MANMO.serialNumber + 3 }
        getString(R.string.name_manmoros) -> { return MANMO.serialNumber + 4 }

        getString(R.string.name_gigaros) -> { return GIGAROS.serialNumber + 1 }
        getString(R.string.name_megaros) -> { return GIGAROS.serialNumber + 2 }
        getString(R.string.name_bitros) -> { return GIGAROS.serialNumber + 3 }
        getString(R.string.name_gagaros) -> { return GIGAROS.serialNumber + 4 }
        getString(R.string.name_teraros) -> { return GIGAROS.serialNumber + 5 }

        getString(R.string.name_earthsnake) -> { return SNAKE.serialNumber + 1 }
        getString(R.string.name_watersnake) -> { return SNAKE.serialNumber + 2 }
        getString(R.string.name_firesnake) -> { return SNAKE.serialNumber + 3 }
        getString(R.string.name_windsnake) -> { return SNAKE.serialNumber + 4 }

        getString(R.string.name_jimung) -> { return DOG.serialNumber + 1 }
        getString(R.string.name_mongmong) -> { return DOG.serialNumber + 2 }
        getString(R.string.name_jindol) -> { return DOG.serialNumber + 3 }
        getString(R.string.name_mongdol) -> { return DOG.serialNumber + 4 }

        getString(R.string.name_gobankes) -> { return ZYAG.serialNumber + 1 }
        getString(R.string.name_zyagra) -> { return ZYAG.serialNumber + 2 }
        getString(R.string.name_zyag) -> { return ZYAG.serialNumber + 3 }
        getString(R.string.name_panji) -> { return ZYAG.serialNumber + 4 }
        getString(R.string.name_seokhwakes) -> { return ZYAG.serialNumber + 5 }
        getString(R.string.name_pangra) -> { return ZYAG.serialNumber + 6 }
        getString(R.string.name_pang) -> { return ZYAG.serialNumber + 7 }
        getString(R.string.name_zyahad) -> { return ZYAG.serialNumber + 8 }

        getString(R.string.name_berga) -> { return BERGA.serialNumber + 1 }
        getString(R.string.name_beruru) -> { return BERGA.serialNumber + 2 }
        getString(R.string.name_gorugoru) -> { return BERGA.serialNumber + 3 }
        getString(R.string.name_norunoru) -> { return BERGA.serialNumber + 4 }

        getString(R.string.name_daino) -> { return DAINO.serialNumber + 1 }
        getString(R.string.name_dainos) -> { return DAINO.serialNumber + 2 }
        getString(R.string.name_prakitos) -> { return DAINO.serialNumber + 3 }
        getString(R.string.name_stentos) -> { return DAINO.serialNumber + 4 }
        getString(R.string.name_pritos) -> { return DAINO.serialNumber + 5 }

        getString(R.string.name_notutu2d) -> { return WOOPU2D.serialNumber + 1 }
        getString(R.string.name_popo2d) -> { return WOOPU2D.serialNumber + 2 }
        getString(R.string.name_pututu2d) -> { return WOOPU2D.serialNumber + 3 }
        getString(R.string.name_putu2d) -> { return WOOPU2D.serialNumber + 4 }

        getString(R.string.name_pupu) -> { return WOOPU.serialNumber + 1 }
        getString(R.string.name_woopu) -> { return WOOPU.serialNumber + 2 }
        getString(R.string.name_tutu) -> { return WOOPU.serialNumber + 3 }
        getString(R.string.name_otutu) -> { return WOOPU.serialNumber + 4 }

        getString(R.string.name_teragon) -> { return DORABIS.serialNumber + 1 }
        getString(R.string.name_kargon) -> { return DORABIS.serialNumber + 2 }
        getString(R.string.name_poibys) -> { return DORABIS.serialNumber + 3 }
        getString(R.string.name_dorabys) -> { return DORABIS.serialNumber + 4 }
        getString(R.string.name_putera) -> { return DORABIS.serialNumber + 5 }

        getString(R.string.name_kuling) -> { return KUKURU.serialNumber + 1 }
        getString(R.string.name_kukuru) -> { return KUKURU.serialNumber + 2 }
        getString(R.string.name_poling) -> { return KUKURU.serialNumber + 3 }
        getString(R.string.name_liski) -> { return KUKURU.serialNumber + 4 }
        getString(R.string.name_noski) -> { return KUKURU.serialNumber + 5 }
        getString(R.string.name_laski) -> { return KUKURU.serialNumber + 6 }
        getString(R.string.name_whiteling) -> { return KUKURU.serialNumber + 7 }
        getString(R.string.name_chocoling) -> { return KUKURU.serialNumber + 8 }
        getString(R.string.name_whiterabiit) -> { return KUKURU.serialNumber + 9 }

        getString(R.string.name_beron) -> { return BERON.serialNumber + 1 }
        getString(R.string.name_beroroku) -> { return BERON.serialNumber + 2 }
        getString(R.string.name_beroboku) -> { return BERON.serialNumber + 3 }
        getString(R.string.name_beropori) -> { return BERON.serialNumber + 4 }
        getString(R.string.name_beronoku) -> { return BERON.serialNumber + 5 }
        getString(R.string.name_beton) -> { return BERON.serialNumber + 6 }
        getString(R.string.name_benoturi) -> { return BERON.serialNumber + 7 }
        getString(R.string.name_berobadu) -> { return BERON.serialNumber + 8 }

        getString(R.string.name_gordon) -> { return GORDON.serialNumber + 1 }
        getString(R.string.name_giradon) -> { return GORDON.serialNumber + 2 }
        getString(R.string.name_turdon) -> { return GORDON.serialNumber + 3 }
        getString(R.string.name_gorgo) -> { return GORDON.serialNumber + 4 }
        getString(R.string.name_gramgor) -> { return GORDON.serialNumber + 5 }
        getString(R.string.name_kinggor) -> { return GORDON.serialNumber + 6 }
        getString(R.string.name_goruba) -> { return GORDON.serialNumber + 7 }
        getString(R.string.name_greengor) -> { return GORDON.serialNumber + 8 }

        getString(R.string.name_agoa) -> { return NEGOS.serialNumber + 1 }
        getString(R.string.name_negos) -> { return NEGOS.serialNumber + 2 }
        getString(R.string.name_tarogon) -> { return NEGOS.serialNumber + 3 }
        getString(R.string.name_dagos) -> { return NEGOS.serialNumber + 4 }
        getString(R.string.name_bokugon) -> { return NEGOS.serialNumber + 5 }

        getString(R.string.name_rui) -> { return MUI.serialNumber + 1 }
        getString(R.string.name_mui) -> { return MUI.serialNumber + 2 }
        getString(R.string.name_ssibos) -> { return MUI.serialNumber + 3 }
        getString(R.string.name_tui) -> { return MUI.serialNumber + 4 }
        getString(R.string.name_rubos) -> { return MUI.serialNumber + 5 }
        getString(R.string.name_nobos) -> { return MUI.serialNumber + 6 }

        getString(R.string.name_kkomi) -> { return KKOMI.serialNumber + 1 }
        getString(R.string.name_kkobi) -> { return KKOMI.serialNumber + 2 }
        getString(R.string.name_kkobio) -> { return KKOMI.serialNumber + 3 }
        getString(R.string.name_kkokkobi) -> { return KKOMI.serialNumber + 4 }
        getString(R.string.name_pingkkomi) -> { return KKOMI.serialNumber + 5 }
        getString(R.string.name_gooda) -> { return KKOMI.serialNumber + 6 }

        getString(R.string.name_kaku) -> { return KAKU.serialNumber + 1 }
        getString(R.string.name_baka) -> { return KAKU.serialNumber + 2 }
        getString(R.string.name_bau) -> { return KAKU.serialNumber + 3 }
        getString(R.string.name_kau) -> { return KAKU.serialNumber + 4 }

        getString(R.string.name_barorokus) -> { return NOSTOROS.serialNumber + 1 }
        getString(R.string.name_lanberos) -> { return NOSTOROS.serialNumber + 2 }
        getString(R.string.name_koritorus) -> { return NOSTOROS.serialNumber + 3 }
        getString(R.string.name_nostoros) -> { return NOSTOROS.serialNumber + 4 }
        getString(R.string.name_nororokus) -> { return NOSTOROS.serialNumber + 5 }
        getString(R.string.name_silbarokus) -> { return NOSTOROS.serialNumber + 6 }
        getString(R.string.name_dirorokus) -> { return NOSTOROS.serialNumber + 7 }
        getString(R.string.name_jinjutoros) -> { return NOSTOROS.serialNumber + 8 }

        getString(R.string.name_tora) -> { return TORA.serialNumber + 1 }
        getString(R.string.name_perpe) -> { return TORA.serialNumber + 2 }
        getString(R.string.name_karpe) -> { return TORA.serialNumber + 3 }
        getString(R.string.name_syuwoo) -> { return TORA.serialNumber + 4 }
        getString(R.string.name_minis) -> { return TORA.serialNumber + 5 }

        getString(R.string.name_taki) -> { return KAKI.serialNumber + 1 }
        getString(R.string.name_kuku) -> { return KAKI.serialNumber + 2 }
        getString(R.string.name_horku) -> { return KAKI.serialNumber + 3 }
        getString(R.string.name_kaki) -> { return KAKI.serialNumber + 4 }

        getString(R.string.name_storaji) -> { return STORAJI.serialNumber + 1 }
        getString(R.string.name_atoraji) -> { return STORAJI.serialNumber + 2 }
        getString(R.string.name_arinos) -> { return STORAJI.serialNumber + 3 }
        getString(R.string.name_dainoros) -> { return STORAJI.serialNumber + 4 }
        getString(R.string.name_darinos) -> { return STORAJI.serialNumber + 5 }
        getString(R.string.name_tarnoros) -> { return STORAJI.serialNumber + 6 }
        getString(R.string.name_arinoros) -> { return STORAJI.serialNumber + 7 }
        getString(R.string.name_purnoros) -> { return STORAJI.serialNumber + 8 }

        getString(R.string.name_tanopus) -> { return PENTAS.serialNumber + 1 }
        getString(R.string.name_notas) -> { return PENTAS.serialNumber + 2 }
        getString(R.string.name_kobals) -> { return PENTAS.serialNumber + 3 }
        getString(R.string.name_tarpus) -> { return PENTAS.serialNumber + 4 }
        getString(R.string.name_torinopus) -> { return PENTAS.serialNumber + 5 }
        getString(R.string.name_pentas) -> { return PENTAS.serialNumber + 6 }
        getString(R.string.name_torikera) -> { return PENTAS.serialNumber + 7 }
        getString(R.string.name_toripus) -> { return PENTAS.serialNumber + 8 }

        getString(R.string.name_lagogo) -> { return LAGOGO.serialNumber + 1}
        getString(R.string.name_hubaba) -> { return LAGOGO.serialNumber + 2}
        getString(R.string.name_toruru) -> { return LAGOGO.serialNumber + 3}
        getString(R.string.name_luni) -> { return LAGOGO.serialNumber + 4}

        getString(R.string.name_noboogi) -> { return BOOGI.serialNumber + 1 }
        getString(R.string.name_boogi) -> { return BOOGI.serialNumber + 2 }
        getString(R.string.name_kkangboogi) -> { return BOOGI.serialNumber + 3 }
        getString(R.string.name_dolboogi) -> { return BOOGI.serialNumber + 4 }
        getString(R.string.name_mulboogi) -> { return BOOGI.serialNumber + 5 }
        getString(R.string.name_kkoboogi) -> { return BOOGI.serialNumber + 6 }
        getString(R.string.name_cheolboogi) -> { return BOOGI.serialNumber + 7 }
        getString(R.string.name_kingboogi) -> { return BOOGI.serialNumber + 8 }

        getString(R.string.name_woori) -> { return DOORI.serialNumber + 1 }
        getString(R.string.name_doori) -> { return DOORI.serialNumber + 2 }
        getString(R.string.name_stainwoori) -> { return DOORI.serialNumber + 3 }

        getString(R.string.name_paaran) -> { return RARE.serialNumber + 1 }
        getString(R.string.name_goruru) -> { return RARE.serialNumber + 2 }
        getString(R.string.name_kingkkomi) -> { return RARE.serialNumber + 3 }
        getString(R.string.name_morax) -> { return RARE.serialNumber + 4 }

        getString(R.string.name_kabit) -> { return KEIBEE.serialNumber + 1 }
        getString(R.string.name_keibee) -> { return KEIBEE.serialNumber + 2 }
        getString(R.string.name_kyuee) -> { return KEIBEE.serialNumber + 3 }
        getString(R.string.name_goldkabit) -> { return KEIBEE.serialNumber + 4 }

        getString(R.string.name_pwito) -> { return MONASIPU.serialNumber + 1 }
        getString(R.string.name_monasipu) -> { return MONASIPU.serialNumber + 2 }
        getString(R.string.name_lanapu) -> { return MONASIPU.serialNumber + 3 }
        getString(R.string.name_laihon) -> { return MONASIPU.serialNumber + 4 }
        getString(R.string.name_taihon) -> { return MONASIPU.serialNumber + 5 }

        getString(R.string.name_marabia) -> { return MARABIA.serialNumber + 1 }

        getString(R.string.name_bareme) -> { return GODSNAKE.serialNumber + 1 }
        getString(R.string.name_burori) -> { return GODSNAKE.serialNumber + 2 }
        getString(R.string.name_mameru) -> { return GODSNAKE.serialNumber + 3 }
        getString(R.string.name_moyami) -> { return GODSNAKE.serialNumber + 4 }
        getString(R.string.name_blacksnake) -> { return GODSNAKE.serialNumber + 5 }

        else -> { return -1 }
    }
}

// 도감 : 이름, 종류, 환생, 획득방법, 메인속성, 서브속성, 메인속성값, 서브속성값, 1렙 최대값, maxLv최대값, 최대전체성장률, 최소 전체 성장률, 최대 각 스탯 성장률, 1렙 최소값, maxLv 최소값, 최소 각 스탯 성장률
abstract class Pet() {

    abstract val serialnumber:Int

    abstract val name:String
    abstract val type:PET_TYPE
    abstract var reincarnation:Boolean
    abstract val getRoute:String

    abstract val mainElemental: ELEMENTAL
    abstract val subElemental: ELEMENTAL?

    abstract val mainElementalValue:Int
    abstract val subElementalValue:Int

    abstract val initLv:Int
    abstract val initLvMaxHp:Int
    abstract val initLvMaxAtk:Int
    abstract val initLvMaxDef:Int
    abstract val initLvMaxSpd:Int

    abstract val maxLv:Int
    abstract val maxLvMaxHp:Int
    abstract val maxLvMaxAtk:Int
    abstract val maxLvMaxDef:Int
    abstract val maxLvMaxSpd:Int

    abstract val initLvMinHp:Int
    abstract val initLvMinAtk:Int
    abstract val initLvMinDef:Int
    abstract val initLvMinSpd:Int

    abstract val maxLvMinHp:Int
    abstract val maxLvMinAtk:Int
    abstract val maxLvMinDef:Int
    abstract val maxLvMinSpd:Int

    abstract val minAllGrowth:Double
    abstract val maxAllGrowth:Double

    val maxHpGrowth: Double = (maxLvMaxHp - initLvMaxHp).toDouble() / (maxLv - initLv).toDouble()
    val maxAtkGrowth: Double = (maxLvMaxAtk - initLvMaxAtk).toDouble() / (maxLv - initLv).toDouble()
    val maxDefGrowth: Double = (maxLvMaxDef - initLvMaxDef).toDouble() / (maxLv - initLv).toDouble()
    val maxSpdGrowth: Double = (maxLvMaxSpd - initLvMaxSpd).toDouble() / (maxLv - initLv).toDouble()
    val minHpGrowth: Double = (maxLvMinHp - initLvMinHp).toDouble() / (maxLv - initLv).toDouble()
    val minAtkGrowth: Double = (maxLvMinAtk - initLvMinAtk).toDouble() / (maxLv - initLv).toDouble()
    val minDefGrowth: Double = (maxLvMinDef - initLvMinDef).toDouble() / (maxLv - initLv).toDouble()
    val minSpdGrowth: Double = (maxLvMinSpd - initLvMinSpd).toDouble() / (maxLv - initLv).toDouble()
}