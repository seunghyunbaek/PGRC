package best.hyun.pgrc.type.mui

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Nobos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_nobos)
    override val type: PET_TYPE
        get() = PET_TYPE.MUI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_nobos)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 59
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1494
    override val maxLvMaxAtk: Int
        get() = 335
    override val maxLvMaxDef: Int
        get() = 260
    override val maxLvMaxSpd: Int
        get() = 162
    override val initLvMinHp: Int
        get() = 46
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1284
    override val maxLvMinAtk: Int
        get() = 296
    override val maxLvMinDef: Int
        get() = 222
    override val maxLvMinSpd: Int
        get() = 130
    override val minAllGrowth: Double
        get() = 4.541
    override val maxAllGrowth: Double
        get() = 5.248
}