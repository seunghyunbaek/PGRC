package best.hyun.pgrc.type.ktarkas

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Korokas : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_korokas)
    override val type: PET_TYPE
        get() = PET_TYPE.KATARKAS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_korokas)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 38
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1475
    override val maxLvMaxAtk: Int
        get() = 308
    override val maxLvMaxDef: Int
        get() = 333
    override val maxLvMaxSpd: Int
        get() = 105
    override val initLvMinHp: Int
        get() = 30
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1267
    override val maxLvMinAtk: Int
        get() = 271
    override val maxLvMinDef: Int
        get() = 295
    override val maxLvMinSpd: Int
        get() = 74
    override val minAllGrowth: Double
        get() = 4.541
    override val maxAllGrowth: Double
        get() = 5.248
}