package best.hyun.pgrc.type.ogaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Orgon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_orgon)
    override val type: PET_TYPE
        get() = PET_TYPE.OGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_orgon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 60
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1522
    override val maxLvMaxAtk: Int
        get() = 301
    override val maxLvMaxDef: Int
        get() = 246
    override val maxLvMaxSpd: Int
        get() = 182
    override val initLvMinHp: Int
        get() = 47
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1312
    override val maxLvMinAtk: Int
        get() = 263
    override val maxLvMinDef: Int
        get() = 207
    override val maxLvMinSpd: Int
        get() = 151
    override val minAllGrowth: Double
        get() = 4.351
    override val maxAllGrowth: Double
        get() = 5.058
}